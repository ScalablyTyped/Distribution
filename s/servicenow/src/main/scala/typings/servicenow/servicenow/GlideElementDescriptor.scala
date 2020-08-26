package typings.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideElementDescriptor extends js.Object {
  def getAttachmentEncryptionType(): String = js.native
  def getEncryptionType(): String = js.native
  def getInternalType(): String = js.native
  def getLabel(): String = js.native
  def getLength(): Double = js.native
  def getName(): String = js.native
  def getPlural(): Boolean = js.native
  def hasAttachmentsEncrypted(): Boolean = js.native
  def isAutoOrSysID(): Boolean = js.native
  def isChoiceTable(): Boolean = js.native
  def isEdgeEncrypted(): Boolean = js.native
  def isVirtual(): Boolean = js.native
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
  @scala.inline
  implicit class GlideElementDescriptorOps[Self <: GlideElementDescriptor] (val x: Self) extends AnyVal {
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
    def setGetAttachmentEncryptionType(value: () => String): Self = this.set("getAttachmentEncryptionType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEncryptionType(value: () => String): Self = this.set("getEncryptionType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetInternalType(value: () => String): Self = this.set("getInternalType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLabel(value: () => String): Self = this.set("getLabel", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPlural(value: () => Boolean): Self = this.set("getPlural", js.Any.fromFunction0(value))
    @scala.inline
    def setHasAttachmentsEncrypted(value: () => Boolean): Self = this.set("hasAttachmentsEncrypted", js.Any.fromFunction0(value))
    @scala.inline
    def setIsAutoOrSysID(value: () => Boolean): Self = this.set("isAutoOrSysID", js.Any.fromFunction0(value))
    @scala.inline
    def setIsChoiceTable(value: () => Boolean): Self = this.set("isChoiceTable", js.Any.fromFunction0(value))
    @scala.inline
    def setIsEdgeEncrypted(value: () => Boolean): Self = this.set("isEdgeEncrypted", js.Any.fromFunction0(value))
    @scala.inline
    def setIsVirtual(value: () => Boolean): Self = this.set("isVirtual", js.Any.fromFunction0(value))
  }
  
}

