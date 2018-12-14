package typings
package sqlDotJsLib.sqlDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sql.js", "Statement")
@js.native
class Statement () extends js.Object {
  def bind(): scala.Boolean = js.native
  def bind(values: js.Array[scala.Double | java.lang.String | stdLib.Uint8Array]): scala.Boolean = js.native
  def bind(
    values: org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String | stdLib.Uint8Array]
  ): scala.Boolean = js.native
  def free(): scala.Boolean = js.native
  def freemem(): scala.Unit = js.native
  def get(): js.Array[scala.Double | java.lang.String | stdLib.Uint8Array] = js.native
  def get(params: js.Array[scala.Double | java.lang.String | stdLib.Uint8Array]): js.Array[scala.Double | java.lang.String | stdLib.Uint8Array] = js.native
  def get(
    params: org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String | stdLib.Uint8Array]
  ): js.Array[scala.Double | java.lang.String | stdLib.Uint8Array] = js.native
  def getAsObject(): org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String | stdLib.Uint8Array] = js.native
  def getAsObject(params: js.Array[scala.Double | java.lang.String | stdLib.Uint8Array]): org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String | stdLib.Uint8Array] = js.native
  def getAsObject(
    params: org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String | stdLib.Uint8Array]
  ): org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String | stdLib.Uint8Array] = js.native
  def getColumnNames(): js.Array[java.lang.String] = js.native
  def reset(): scala.Unit = js.native
  def run(): scala.Unit = js.native
  def run(values: js.Array[scala.Double | java.lang.String | stdLib.Uint8Array]): scala.Unit = js.native
  def run(
    values: org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String | stdLib.Uint8Array]
  ): scala.Unit = js.native
  def step(): scala.Boolean = js.native
}

