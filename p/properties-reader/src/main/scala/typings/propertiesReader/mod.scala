package typings.propertiesReader

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("properties-reader", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Reader extends js.Object {
    var length: Double = js.native
    def append(path: String): Reader = js.native
    def each(iterator: js.Function2[/* key */ String, /* value */ Value, Unit]): Reader = js.native
    def each[T](iterator: js.ThisFunction2[/* this */ T, /* key */ String, /* value */ Value, Unit], scope: T): Reader = js.native
    def get(propertyName: String): Value | Null = js.native
    def getAllProperties(): StringDictionary[Value] = js.native
    def getRaw(propertyName: String): String | Null = js.native
    def path(): js.Object = js.native
    def read(properties: String): Reader = js.native
    def set(propertyName: String, value: Value): Reader = js.native
  }
  
  def apply(path: String): Reader = js.native
  type Value = String | Double | Boolean
}

