package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XPathNSResolver extends js.Object {
  def lookupNamespaceURI(prefix: java.lang.String): java.lang.String | scala.Null
}

@JSGlobal("XPathNSResolver")
@js.native
class XPathNSResolverCls () extends XPathNSResolver {
  /* CompleteClass */
  override def lookupNamespaceURI(prefix: java.lang.String): java.lang.String | scala.Null = js.native
}

@JSGlobal("XPathNSResolver")
@js.native
object XPathNSResolver
  extends org.scalablytyped.runtime.Instantiable0[XPathNSResolver]

