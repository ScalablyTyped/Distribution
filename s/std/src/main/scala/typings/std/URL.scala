package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The URL interface represents an object providing static methods used for creating object URLs. */
trait URL extends js.Object {
  var hash: java.lang.String
  var host: java.lang.String
  var hostname: java.lang.String
  var href: java.lang.String
  val origin: java.lang.String
  var password: java.lang.String
  var pathname: java.lang.String
  var port: java.lang.String
  var protocol: java.lang.String
  var search: java.lang.String
  val searchParams: URLSearchParams
  var username: java.lang.String
  def toJSON(): java.lang.String
}

@JSGlobal("URL")
@js.native
class URLCls protected () extends URL {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, base: java.lang.String) = this()
  def this(url: java.lang.String, base: URL) = this()
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
  override val searchParams: URLSearchParams = js.native
  /* CompleteClass */
  override var username: java.lang.String = js.native
  /* CompleteClass */
  override def toJSON(): java.lang.String = js.native
}

@JSGlobal("URL")
@js.native
object URL
  extends Instantiable2[/* url */ java.lang.String, (/* base */ java.lang.String) | (/* base */ URL), URL]
     with Instantiable1[/* url */ java.lang.String, URL] {
  def createObjectURL(`object`: js.Any): java.lang.String = js.native
  def revokeObjectURL(url: java.lang.String): Unit = js.native
}

