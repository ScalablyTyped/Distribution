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
    getAttachmentEncryptionType: () => java.lang.String,
    getEncryptionType: () => java.lang.String,
    getInternalType: () => java.lang.String,
    getLabel: () => java.lang.String,
    getLength: () => scala.Double,
    getName: () => java.lang.String,
    getPlural: () => scala.Boolean,
    hasAttachmentsEncrypted: () => scala.Boolean,
    isAutoOrSysID: () => scala.Boolean,
    isChoiceTable: () => scala.Boolean,
    isEdgeEncrypted: () => scala.Boolean,
    isVirtual: () => scala.Boolean
  ): GlideElementDescriptor = {
    val __obj = js.Dynamic.literal(getAttachmentEncryptionType = js.Any.fromFunction0(getAttachmentEncryptionType), getEncryptionType = js.Any.fromFunction0(getEncryptionType), getInternalType = js.Any.fromFunction0(getInternalType), getLabel = js.Any.fromFunction0(getLabel), getLength = js.Any.fromFunction0(getLength), getName = js.Any.fromFunction0(getName), getPlural = js.Any.fromFunction0(getPlural), hasAttachmentsEncrypted = js.Any.fromFunction0(hasAttachmentsEncrypted), isAutoOrSysID = js.Any.fromFunction0(isAutoOrSysID), isChoiceTable = js.Any.fromFunction0(isChoiceTable), isEdgeEncrypted = js.Any.fromFunction0(isEdgeEncrypted), isVirtual = js.Any.fromFunction0(isVirtual))
  
    __obj.asInstanceOf[GlideElementDescriptor]
  }
}

