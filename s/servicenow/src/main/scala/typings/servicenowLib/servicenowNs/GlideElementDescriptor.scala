package typings
package servicenowLib.servicenowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideElementDescriptor extends js.Object {
  def getAttachmentEncryptionType(): java.lang.String
  def getEncryptionType(): java.lang.String
  def getInternalType(): java.lang.String
  def getLabel(): java.lang.String
  def getLength(): scala.Double
  def getName(): java.lang.String
  def getPlural(): scala.Boolean
  def hasAttachmentsEncrypted(): scala.Boolean
  def isAutoOrSysID(): scala.Boolean
  def isChoiceTable(): scala.Boolean
  def isEdgeEncrypted(): scala.Boolean
  def isVirtual(): scala.Boolean
}

object GlideElementDescriptor {
  @scala.inline
  def apply(
    getAttachmentEncryptionType: js.Function0[java.lang.String],
    getEncryptionType: js.Function0[java.lang.String],
    getInternalType: js.Function0[java.lang.String],
    getLabel: js.Function0[java.lang.String],
    getLength: js.Function0[scala.Double],
    getName: js.Function0[java.lang.String],
    getPlural: js.Function0[scala.Boolean],
    hasAttachmentsEncrypted: js.Function0[scala.Boolean],
    isAutoOrSysID: js.Function0[scala.Boolean],
    isChoiceTable: js.Function0[scala.Boolean],
    isEdgeEncrypted: js.Function0[scala.Boolean],
    isVirtual: js.Function0[scala.Boolean]
  ): GlideElementDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAttachmentEncryptionType")(getAttachmentEncryptionType)
    __obj.updateDynamic("getEncryptionType")(getEncryptionType)
    __obj.updateDynamic("getInternalType")(getInternalType)
    __obj.updateDynamic("getLabel")(getLabel)
    __obj.updateDynamic("getLength")(getLength)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getPlural")(getPlural)
    __obj.updateDynamic("hasAttachmentsEncrypted")(hasAttachmentsEncrypted)
    __obj.updateDynamic("isAutoOrSysID")(isAutoOrSysID)
    __obj.updateDynamic("isChoiceTable")(isChoiceTable)
    __obj.updateDynamic("isEdgeEncrypted")(isEdgeEncrypted)
    __obj.updateDynamic("isVirtual")(isVirtual)
    __obj.asInstanceOf[GlideElementDescriptor]
  }
}

