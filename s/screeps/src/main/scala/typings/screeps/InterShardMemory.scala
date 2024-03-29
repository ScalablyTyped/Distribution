package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `InterShardMemory` object provides an interface for communicating between shards.
  * Your script is executed separatedly on each shard, and their `Memory` objects are isolated from each other.
  * In order to pass messages and data between shards, you need to use `InterShardMemory` instead.
  *
  * Every shard can have its own data string that can be accessed by all other shards.
  * A shard can write only to its own data, other shards' data is read-only.
  *
  * This data has nothing to do with `Memory` contents, it's a separate data container.
  */
trait InterShardMemory extends StObject {
  
  /**
    * Returns the string contents of the current shard's data.
    */
  def getLocal(): String
  
  /**
    * Returns the string contents of another shard's data, null if shard exists but data is not set.
    *
    * @param shard Shard name.
    * @throws Error if shard name is invalid
    */
  def getRemote(shard: String): String | Null
  
  /**
    * Replace the current shard's data with the new value
    * @param value New data value in string format.
    */
  def setLocal(value: String): Unit
}
object InterShardMemory {
  
  inline def apply(getLocal: () => String, getRemote: String => String | Null, setLocal: String => Unit): InterShardMemory = {
    val __obj = js.Dynamic.literal(getLocal = js.Any.fromFunction0(getLocal), getRemote = js.Any.fromFunction1(getRemote), setLocal = js.Any.fromFunction1(setLocal))
    __obj.asInstanceOf[InterShardMemory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterShardMemory] (val x: Self) extends AnyVal {
    
    inline def setGetLocal(value: () => String): Self = StObject.set(x, "getLocal", js.Any.fromFunction0(value))
    
    inline def setGetRemote(value: String => String | Null): Self = StObject.set(x, "getRemote", js.Any.fromFunction1(value))
    
    inline def setSetLocal(value: String => Unit): Self = StObject.set(x, "setLocal", js.Any.fromFunction1(value))
  }
}
