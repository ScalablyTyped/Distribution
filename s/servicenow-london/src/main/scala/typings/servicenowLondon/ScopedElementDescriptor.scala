package typings.servicenowLondon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScopedElementDescriptor extends StObject {
  
  /**
    * Returns the encryption type used for attachments on the element's table.
    *
    * @returns The encryption type used on attachments. Returns null if attachments on the element's
    * table are not being encrypted.
    * @example
    *
    * var grInc = new GlideRecord('incident');
    * grInc.query('priority', '1');
    *
    * var field = grInc.getElement('priority');
    * var ed = field.getED();
    *
    * var isEdge = ed.getAttachmentEncryptionType();
    * gs.info(isEdge);
    * // null
    */
  def getAttachmentEncryptionType(): String
  
  /**
    * Returns the element's encryption type.
    *
    * @returns The element's encryption type. Returns null if the element is not
    * encrypted.
    * @example
    *
    * var grInc = new GlideRecord('incident');
    * grInc.query('priority', '1');
    *
    * var field = grInc.getElement('priority');
    * var ed = field.getED();
    *
    * sEdge = ed.getEncryptionType();
    * gs.info(isEdge);
    * // null
    */
  def getEncryptionType(): String
  
  /**
    * Returns the element's internal data type.
    *
    * @returns The element's internal data type.
    * @example
    *
    * var grInc = new GlideRecord('incident');
    * grInc.query('priority', '1');
    *
    * var field = grInc.getElement('priority');
    * var ed = field.getED();
    *
    * var isEdge = ed.getInternalType();
    * gs.info(isEdge);
    */
  def getInternalType(): String
  
  /**
    * Returns the element's label.
    *
    * @returns The element's label.
    * @example
    *
    * var grInc = new GlideRecord('incident');
    * grInc.query('priority', '1');
    *
    * var field = grInc.getElement('priority');
    * var ed = field.getED();
    *
    * var isEdge = ed.getLabel();
    * gs.info(isEdge);
    * // Priority
    */
  def getLabel(): String
  
  /**
    * Returns the element's length.
    *
    * @returns The element's size.
    * @example
    *
    * var grInc = new GlideRecord('incident');
    * grInc.query('priority', '1');
    *
    * var field = grInc.getElement('priority');
    * var ed = field.getED();
    *
    * var isEdge = ed.getLength();
    * gs.info(isEdge);
    * // 40
    */
  def getLength(): Double
  
  /**
    * Returns the element's name.
    *
    * @returns The element's name.
    * @example
    *
    * var grInc = new GlideRecord('incident');
    * grInc.query('priority', '1');
    *
    * var field = grInc.getElement('priority');
    * var ed = field.getED();
    *
    * var isEdge = ed.getName();
    * gs.info(isEdge);
    * // priority
    */
  def getName(): String
  
  /**
    * Returns the element's plural label.
    *
    * @returns The element's plural label.
    * @example
    *
    * var gr = new GlideRecord('incident');
    * gr.query();
    * var ed = gr.getED();
    * gs.info(ed.getPlural());
    * // Incidents
    */
  def getPlural(): String
  
  /**
    * Returns true if an encrypted attachment has been added to the table.
    *
    * @returns Returns true if an encrypted attachment has been added to the table.
    * @example
    *
    * var grInc = new GlideRecord('incident');
    * grInc.query('priority', '1');
    *
    * var field = grInc.getElement('priority');
    * var ed = field.getED();
    *
    * var isEdge = ed.hasAttachmentsEncrypted();
    * gs.info(isEdge);
    * // false
    */
  def hasAttachmentsEncrypted(): Boolean
  
  /**
    * Returns true if the element is an automatically generated or system field.
    *
    * @returns True if the element is automatically generated or a system field.
    * @example
    *
    * var grInc = new GlideRecord('incident');
    * grInc.query('priority', '1');
    * var field = grInc.getElement('priority');
    * var ed = field.getED();
    *
    * isEdge = ed.isAutoOrSysID();
    * gs.info(isEdge);
    * // false
    */
  def isAutoOrSysID(): Boolean
  
  /**
    * Returns true if the element is defined as a dropdown choice in its dictionary
    * definition.
    *
    * @returns Returns true if the element is defined as a dropdown choice. Returns true even
    * if there are no entries defined in the choice table. The last choice type,
    * suggestion, does not return true.
    * @example
    *
    * var grInc = new GlideRecord('incident');
    * grInc.query('priority', '1');
    *
    * var field = grInc.getElement('priority');
    * var ed = field.getED();
    *
    * var isChoiceTable = ed.isChoiceTable();
    * gs.info(isChoiceTable);
    * // true
    */
  def isChoiceTable(): Boolean
  
  /**
    * Returns true if an element is encrypted.
    *
    * @returns Returns true if the element is encrypted, false otherwise.
    * @example
    *
    * var grInc = new GlideRecord('incident');
    * grInc.query('priority', '1');
    *
    * var field = grInc.getElement('priority');
    * var ed = field.getED();
    *
    * var isEdge = ed.isEdgeEncrypted();
    * gs.info(isEdge)
    * // false
    */
  def isEdgeEncrypted(): Boolean
  
  /**
    * Returns true if the element is a virtual element.
    *
    * A virtual element is a calculated field as set by the dictionary definition of the field.
    * Virtual fields cannot be encrypted.
    *
    * @returns Returns true if the element is a virtual element.
    * @example
    *
    * var grInc = new GlideRecord('incident');
    * grInc.query('priority', '1');
    *
    * var field = grInc.getElement('priority');
    * var ed = field.getED();
    *
    * var isVirtual = ed.isVirtual();
    * gs.info(isVirtual);
    * // false
    */
  def isVirtual(): Boolean
}
object ScopedElementDescriptor {
  
  @scala.inline
  def apply(
    getAttachmentEncryptionType: () => String,
    getEncryptionType: () => String,
    getInternalType: () => String,
    getLabel: () => String,
    getLength: () => Double,
    getName: () => String,
    getPlural: () => String,
    hasAttachmentsEncrypted: () => Boolean,
    isAutoOrSysID: () => Boolean,
    isChoiceTable: () => Boolean,
    isEdgeEncrypted: () => Boolean,
    isVirtual: () => Boolean
  ): ScopedElementDescriptor = {
    val __obj = js.Dynamic.literal(getAttachmentEncryptionType = js.Any.fromFunction0(getAttachmentEncryptionType), getEncryptionType = js.Any.fromFunction0(getEncryptionType), getInternalType = js.Any.fromFunction0(getInternalType), getLabel = js.Any.fromFunction0(getLabel), getLength = js.Any.fromFunction0(getLength), getName = js.Any.fromFunction0(getName), getPlural = js.Any.fromFunction0(getPlural), hasAttachmentsEncrypted = js.Any.fromFunction0(hasAttachmentsEncrypted), isAutoOrSysID = js.Any.fromFunction0(isAutoOrSysID), isChoiceTable = js.Any.fromFunction0(isChoiceTable), isEdgeEncrypted = js.Any.fromFunction0(isEdgeEncrypted), isVirtual = js.Any.fromFunction0(isVirtual))
    __obj.asInstanceOf[ScopedElementDescriptor]
  }
  
  @scala.inline
  implicit class ScopedElementDescriptorMutableBuilder[Self <: ScopedElementDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAttachmentEncryptionType(value: () => String): Self = StObject.set(x, "getAttachmentEncryptionType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEncryptionType(value: () => String): Self = StObject.set(x, "getEncryptionType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInternalType(value: () => String): Self = StObject.set(x, "getInternalType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLabel(value: () => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPlural(value: () => String): Self = StObject.set(x, "getPlural", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasAttachmentsEncrypted(value: () => Boolean): Self = StObject.set(x, "hasAttachmentsEncrypted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsAutoOrSysID(value: () => Boolean): Self = StObject.set(x, "isAutoOrSysID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsChoiceTable(value: () => Boolean): Self = StObject.set(x, "isChoiceTable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEdgeEncrypted(value: () => Boolean): Self = StObject.set(x, "isEdgeEncrypted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsVirtual(value: () => Boolean): Self = StObject.set(x, "isVirtual", js.Any.fromFunction0(value))
  }
}
