package typings.rcVirtualList.cacheMapMod

import typings.react.mod.ReactText
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheMap extends js.Object {
  
  def get(key: ReactText): Double = js.native
  
  var maps: Record[String, Double] = js.native
  
  def set(key: ReactText, value: Double): Unit = js.native
}
object CacheMap {
  
  @scala.inline
  def apply(get: ReactText => Double, maps: Record[String, Double], set: (ReactText, Double) => Unit): CacheMap = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), maps = maps.asInstanceOf[js.Any], set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[CacheMap]
  }
  
  @scala.inline
  implicit class CacheMapOps[Self <: CacheMap] (val x: Self) extends AnyVal {
    
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
    def setGet(value: ReactText => Double): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaps(value: Record[String, Double]): Self = this.set("maps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: (ReactText, Double) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
}
