package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("URL")
@js.native
class URL protected ()
  extends typings.std.URL {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, base: java.lang.String) = this()
  def this(url: java.lang.String, base: typings.std.URL) = this()
  /* CompleteClass */
  override var hash: java.lang.String = js.native
  /* CompleteClass */
  override var host: java.lang.String = js.native
  /* CompleteClass */
  override var hostname: java.lang.String = js.native
  /* CompleteClass */
  override var href: java.lang.String = js.native
  /* CompleteClass */
  override val origin: java.lang.String = js.native
  /* CompleteClass */
  override var password: java.lang.String = js.native
  /* CompleteClass */
  override var pathname: java.lang.String = js.native
  /* CompleteClass */
  override var port: java.lang.String = js.native
  /* CompleteClass */
  override var protocol: java.lang.String = js.native
  /* CompleteClass */
  override var search: java.lang.String = js.native
  /* CompleteClass */
  override val searchParams: typings.std.URLSearchParams = js.native
  /* CompleteClass */
  override var username: java.lang.String = js.native
  /* CompleteClass */
  override def toJSON(): java.lang.String = js.native
}

@JSGlobal("URL")
@js.native
object URL
  extends Instantiable1[/* url */ java.lang.String, typings.std.URL]
     with Instantiable2[
      /* url */ java.lang.String, 
      (/* base */ java.lang.String) | (/* base */ typings.std.URL), 
      typings.std.URL
    ] {
  def createObjectURL(`object`: js.Any): java.lang.String = js.native
  def revokeObjectURL(url: java.lang.String): Unit = js.native
}

