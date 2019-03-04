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
    val __obj = js.Dynamic.literal(getAttachmentEncryptionType = getAttachmentEncryptionType, getEncryptionType = getEncryptionType, getInternalType = getInternalType, getLabel = getLabel, getLength = getLength, getName = getName, getPlural = getPlural, hasAttachmentsEncrypted = hasAttachmentsEncrypted, isAutoOrSysID = isAutoOrSysID, isChoiceTable = isChoiceTable, isEdgeEncrypted = isEdgeEncrypted, isVirtual = isVirtual)
  
    __obj.asInstanceOf[GlideElementDescriptor]
  }
}

