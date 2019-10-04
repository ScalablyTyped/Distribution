package typings.relayDashRuntime.libUtilReaderNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderModuleImport extends js.Object {
  val documentName: String
  val fragmentName: String
  val fragmentPropName: String
  val kind: String
}

object ReaderModuleImport {
  @scala.inline
  def apply(documentName: String, fragmentName: String, fragmentPropName: String, kind: String): ReaderModuleImport = {
    val __obj = js.Dynamic.literal(documentName = documentName, fragmentName = fragmentName, fragmentPropName = fragmentPropName, kind = kind)
  
    __obj.asInstanceOf[ReaderModuleImport]
  }
}

