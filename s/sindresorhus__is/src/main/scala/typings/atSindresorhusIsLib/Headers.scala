package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers extends js.Object {
  def append(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def delete(name: java.lang.String): scala.Unit = js.native
  def forEach(
    callbackfn: js.Function3[
      /* value */ java.lang.String, 
      /* key */ java.lang.String, 
      /* parent */ this.type, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def forEach(
    callbackfn: js.Function3[
      /* value */ java.lang.String, 
      /* key */ java.lang.String, 
      /* parent */ this.type, 
      scala.Unit
    ],
    thisArg: js.Any
  ): scala.Unit = js.native
  def get(name: java.lang.String): java.lang.String | scala.Null = js.native
  def has(name: java.lang.String): scala.Boolean = js.native
  def set(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
}

@JSGlobal("Headers")
@js.native
object Headers
  extends org.scalablytyped.runtime.Instantiable0[Headers]
     with org.scalablytyped.runtime.Instantiable1[/* init */ HeadersInit, Headers]

