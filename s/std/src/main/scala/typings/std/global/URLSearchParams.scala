package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("URLSearchParams")
@js.native
class URLSearchParams ()
  extends typings.std.URLSearchParams {
  def this(init: java.lang.String) = this()
  def this(init: js.Array[js.Array[java.lang.String]]) = this()
  def this(init: Record[java.lang.String, java.lang.String]) = this()
  def this(init: typings.std.URLSearchParams) = this()
}

@JSGlobal("URLSearchParams")
@js.native
object URLSearchParams
  extends Instantiable0[typings.std.URLSearchParams]
     with Instantiable1[
      (/* init */ js.Array[js.Array[java.lang.String]]) | (/* init */ Record[java.lang.String, java.lang.String]) | (/* init */ java.lang.String) | (/* init */ typings.std.URLSearchParams), 
      typings.std.URLSearchParams
    ]

