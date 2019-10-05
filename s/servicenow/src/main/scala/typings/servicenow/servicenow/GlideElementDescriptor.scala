package typings.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideElementDescriptor extends js.Object {
  def getAttachmentEncryptionType(): String
  def getEncryptionType(): String
  def getInternalType(): String
  def getLabel(): String
  def getLength(): Double
  def getName(): String
  def getPlural(): Boolean
  def hasAttachmentsEncrypted(): Boolean
  def isAutoOrSysID(): Boolean
  def isChoiceTable(): Boolean
  def isEdgeEncrypted(): Boolean
  def isVirtual(): Boolean
}

object GlideElementDescriptor {
  @scala.inline
  def apply(
    getAttachmentEncryptionType: () => String,
    getEncryptionType: () => String,
    getInternalType: () => String,
    getLabel: () => String,
    getLength: () => Double,
    getName: () => String,
    getPlural: () => Boolean,
    hasAttachmentsEncrypted: () => Boolean,
    isAutoOrSysID: () => Boolean,
    isChoiceTable: () => Boolean,
    isEdgeEncrypted: () => Boolean,
    isVirtual: () => Boolean
  ): GlideElementDescriptor = {
    val __obj = js.Dynamic.literal(getAttachmentEncryptionType = js.Any.fromFunction0(getAttachmentEncryptionType), getEncryptionType = js.Any.fromFunction0(getEncryptionType), getInternalType = js.Any.fromFunction0(getInternalType), getLabel = js.Any.fromFunction0(getLabel), getLength = js.Any.fromFunction0(getLength), getName = js.Any.fromFunction0(getName), getPlural = js.Any.fromFunction0(getPlural), hasAttachmentsEncrypted = js.Any.fromFunction0(hasAttachmentsEncrypted), isAutoOrSysID = js.Any.fromFunction0(isAutoOrSysID), isChoiceTable = js.Any.fromFunction0(isChoiceTable), isEdgeEncrypted = js.Any.fromFunction0(isEdgeEncrypted), isVirtual = js.Any.fromFunction0(isVirtual))
  
    __obj.asInstanceOf[GlideElementDescriptor]
  }
}

