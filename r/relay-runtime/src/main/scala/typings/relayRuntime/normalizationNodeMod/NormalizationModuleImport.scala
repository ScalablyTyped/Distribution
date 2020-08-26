package typings.relayRuntime.normalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalizationModuleImport extends NormalizationSelection {
  var documentName: String = js.native
  var fragmentName: String = js.native
  var fragmentPropName: String = js.native
  var kind: String = js.native
}

object NormalizationModuleImport {
  @scala.inline
  def apply(documentName: String, fragmentName: String, fragmentPropName: String, kind: String): NormalizationModuleImport = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], fragmentName = fragmentName.asInstanceOf[js.Any], fragmentPropName = fragmentPropName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationModuleImport]
  }
  @scala.inline
  implicit class NormalizationModuleImportOps[Self <: NormalizationModuleImport] (val x: Self) extends AnyVal {
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
    def setDocumentName(value: String): Self = this.set("documentName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFragmentName(value: String): Self = this.set("fragmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFragmentPropName(value: String): Self = this.set("fragmentPropName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
  
}

