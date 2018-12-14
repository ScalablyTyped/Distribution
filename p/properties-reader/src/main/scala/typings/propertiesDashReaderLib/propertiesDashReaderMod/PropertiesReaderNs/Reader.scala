package typings
package propertiesDashReaderLib.propertiesDashReaderMod.PropertiesReaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reader extends js.Object {
  var length: scala.Double = js.native
  def append(path: java.lang.String): Reader = js.native
  def each(iterator: js.Function2[/* key */ java.lang.String, /* value */ Value, scala.Unit]): Reader = js.native
  def each[T](
    iterator: js.ThisFunction2[/* this */ T, /* key */ java.lang.String, /* value */ Value, scala.Unit],
    scope: T
  ): Reader = js.native
  def get(propertyName: java.lang.String): Value | scala.Null = js.native
  def getAllProperties(): org.scalablytyped.runtime.StringDictionary[Value] = js.native
  def getRaw(propertyName: java.lang.String): java.lang.String | scala.Null = js.native
  def path(): js.Object = js.native
  def read(properties: java.lang.String): Reader = js.native
  def set(propertyName: java.lang.String, value: Value): Reader = js.native
}

