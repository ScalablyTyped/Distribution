package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CPU extends StObject {
  
  /**
    * An amount of unused CPU accumulated in your bucket.
    * @see http://docs.screeps.com/cpu-limit.html#Bucket
    */
  var bucket: Double
  
  /**
    * Generate 1 pixel resource unit for 5000 CPU from your bucket.
    */
  def generatePixel(): OK | ERR_NOT_ENOUGH_RESOURCES
  
  /**
    * Use this method to get heap statistics for your virtual machine.
    *
    * This method will be undefined if you are not using IVM.
    *
    * The return value is almost identical to the Node.js function v8.getHeapStatistics().
    * This function returns one additional property: externally_allocated_size which is the total amount of currently
    * allocated memory which is not included in the v8 heap but counts against this isolate's memory limit.
    * ArrayBuffer instances over a certain size are externally allocated and will be counted here.
    */
  var getHeapStatistics: js.UndefOr[js.Function0[HeapStatistics]] = js.undefined
  
  /**
    * Get amount of CPU time used from the beginning of the current game tick. Always returns 0 in the Simulation mode.
    */
  def getUsed(): Double
  
  /**
    * This method will be undefined if you are not using IVM.
    *
    * Reset your runtime environment and wipe all data in heap memory.
    * Player code execution stops immediately.
    */
  var halt: js.UndefOr[js.Function0[scala.Nothing]] = js.undefined
  
  /**
    * Your assigned CPU limit for the current shard.
    */
  var limit: Double
  
  /**
    * Allocate CPU limits to different shards. Total amount of CPU should remain equal to `Game.cpu.shardLimits`.
    * This method can be used only once per 12 hours.
    *
    * @param limits An object with CPU values for each shard in the same format as `Game.cpu.shardLimits`.
    * @returns One of the following codes: `OK | ERR_BUSY | ERR_INVALID_ARGS`
    */
  def setShardLimits(limits: CPUShardLimits): OK | ERR_BUSY | ERR_INVALID_ARGS
  
  /**
    * An object with limits for each shard with shard names as keys. You can use `setShardLimits` method to re-assign them.
    */
  var shardLimits: CPUShardLimits
  
  /**
    * An amount of available CPU time at the current game tick. Usually it is higher than `Game.cpu.limit`.
    */
  var tickLimit: Double
  
  /**
    * Unlock full CPU for your account for additional 24 hours.
    * This method will consume 1 CPU unlock bound to your account (See `Game.resources`).
    * If full CPU is not currently unlocked for your account, it may take some time (up to 5 minutes) before unlock is applied to your account.
    */
  def unlock(): OK | ERR_NOT_ENOUGH_RESOURCES | ERR_FULL
  
  /**
    * Whether full CPU is currently unlocked for your account.
    */
  var unlocked: Boolean
  
  /**
    * The time in milliseconds since UNIX epoch time until full CPU is unlocked for your account.
    * This property is not defined when full CPU is not unlocked for your account or it's unlocked with a subscription.
    */
  var unlockedTime: js.UndefOr[Double] = js.undefined
}
object CPU {
  
  @scala.inline
  def apply(
    bucket: Double,
    generatePixel: () => OK | ERR_NOT_ENOUGH_RESOURCES,
    getUsed: () => Double,
    limit: Double,
    setShardLimits: CPUShardLimits => OK | ERR_BUSY | ERR_INVALID_ARGS,
    shardLimits: CPUShardLimits,
    tickLimit: Double,
    unlock: () => OK | ERR_NOT_ENOUGH_RESOURCES | ERR_FULL,
    unlocked: Boolean
  ): CPU = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], generatePixel = js.Any.fromFunction0(generatePixel), getUsed = js.Any.fromFunction0(getUsed), limit = limit.asInstanceOf[js.Any], setShardLimits = js.Any.fromFunction1(setShardLimits), shardLimits = shardLimits.asInstanceOf[js.Any], tickLimit = tickLimit.asInstanceOf[js.Any], unlock = js.Any.fromFunction0(unlock), unlocked = unlocked.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPU]
  }
  
  @scala.inline
  implicit class CPUMutableBuilder[Self <: CPU] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: Double): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratePixel(value: () => OK | ERR_NOT_ENOUGH_RESOURCES): Self = StObject.set(x, "generatePixel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeapStatistics(value: () => HeapStatistics): Self = StObject.set(x, "getHeapStatistics", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeapStatisticsUndefined: Self = StObject.set(x, "getHeapStatistics", js.undefined)
    
    @scala.inline
    def setGetUsed(value: () => Double): Self = StObject.set(x, "getUsed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHalt(value: () => scala.Nothing): Self = StObject.set(x, "halt", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHaltUndefined: Self = StObject.set(x, "halt", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetShardLimits(value: CPUShardLimits => OK | ERR_BUSY | ERR_INVALID_ARGS): Self = StObject.set(x, "setShardLimits", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShardLimits(value: CPUShardLimits): Self = StObject.set(x, "shardLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickLimit(value: Double): Self = StObject.set(x, "tickLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlock(value: () => OK | ERR_NOT_ENOUGH_RESOURCES | ERR_FULL): Self = StObject.set(x, "unlock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnlocked(value: Boolean): Self = StObject.set(x, "unlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlockedTime(value: Double): Self = StObject.set(x, "unlockedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlockedTimeUndefined: Self = StObject.set(x, "unlockedTime", js.undefined)
  }
}
