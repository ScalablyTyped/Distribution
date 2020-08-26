package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CPU extends js.Object {
  /**
    * An amount of unused CPU accumulated in your bucket.
    * @see http://docs.screeps.com/cpu-limit.html#Bucket
    */
  var bucket: Double = js.native
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
  var getHeapStatistics: js.UndefOr[js.Function0[HeapStatistics]] = js.native
  /**
    * This method will be undefined if you are not using IVM.
    *
    * Reset your runtime environment and wipe all data in heap memory.
    * Player code execution stops immediately.
    */
  var halt: js.UndefOr[js.Function0[scala.Nothing]] = js.native
  /**
    * Your assigned CPU limit for the current shard.
    */
  var limit: Double = js.native
  /**
    * An object with limits for each shard with shard names as keys. You can use `setShardLimits` method to re-assign them.
    */
  var shardLimits: CPUShardLimits = js.native
  /**
    * An amount of available CPU time at the current game tick. Usually it is higher than `Game.cpu.limit`.
    */
  var tickLimit: Double = js.native
  /**
    * Whether full CPU is currently unlocked for your account.
    */
  var unlocked: Boolean = js.native
  /**
    * The time in milliseconds since UNIX epoch time until full CPU is unlocked for your account.
    * This property is not defined when full CPU is not unlocked for your account or it's unlocked with a subscription.
    */
  var unlockedTime: js.UndefOr[Double] = js.native
  /**
    * Generate 1 pixel resource unit for 5000 CPU from your bucket.
    */
  def generatePixel(): OK | ERR_NOT_ENOUGH_RESOURCES = js.native
  /**
    * Get amount of CPU time used from the beginning of the current game tick. Always returns 0 in the Simulation mode.
    */
  def getUsed(): Double = js.native
  /**
    * Allocate CPU limits to different shards. Total amount of CPU should remain equal to `Game.cpu.shardLimits`.
    * This method can be used only once per 12 hours.
    *
    * @param limits An object with CPU values for each shard in the same format as `Game.cpu.shardLimits`.
    * @returns One of the following codes: `OK | ERR_BUSY | ERR_INVALID_ARGS`
    */
  def setShardLimits(limits: CPUShardLimits): OK | ERR_BUSY | ERR_INVALID_ARGS = js.native
  /**
    * Unlock full CPU for your account for additional 24 hours.
    * This method will consume 1 CPU unlock bound to your account (See `Game.resources`).
    * If full CPU is not currently unlocked for your account, it may take some time (up to 5 minutes) before unlock is applied to your account.
    */
  def unlock(): OK | ERR_NOT_ENOUGH_RESOURCES | ERR_FULL = js.native
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
  implicit class CPUOps[Self <: CPU] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucket(value: Double): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeneratePixel(value: () => OK | ERR_NOT_ENOUGH_RESOURCES): Self = this.set("generatePixel", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUsed(value: () => Double): Self = this.set("getUsed", js.Any.fromFunction0(value))
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetShardLimits(value: CPUShardLimits => OK | ERR_BUSY | ERR_INVALID_ARGS): Self = this.set("setShardLimits", js.Any.fromFunction1(value))
    @scala.inline
    def setShardLimits(value: CPUShardLimits): Self = this.set("shardLimits", value.asInstanceOf[js.Any])
    @scala.inline
    def setTickLimit(value: Double): Self = this.set("tickLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnlock(value: () => OK | ERR_NOT_ENOUGH_RESOURCES | ERR_FULL): Self = this.set("unlock", js.Any.fromFunction0(value))
    @scala.inline
    def setUnlocked(value: Boolean): Self = this.set("unlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetHeapStatistics(value: () => HeapStatistics): Self = this.set("getHeapStatistics", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetHeapStatistics: Self = this.set("getHeapStatistics", js.undefined)
    @scala.inline
    def setHalt(value: () => scala.Nothing): Self = this.set("halt", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHalt: Self = this.set("halt", js.undefined)
    @scala.inline
    def setUnlockedTime(value: Double): Self = this.set("unlockedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnlockedTime: Self = this.set("unlockedTime", js.undefined)
  }
  
}

