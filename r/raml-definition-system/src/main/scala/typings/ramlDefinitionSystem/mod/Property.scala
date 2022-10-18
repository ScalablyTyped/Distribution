package typings.ramlDefinitionSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify typeSystem.Property * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify typeSystem.IProperty * / any */ @JSImport("raml-definition-system", "Property")
@js.native
open class Property () extends StObject {
  
  /* private */ var _allowsNull: Any = js.native
  
  /* private */ var _canBeDuplicator: Any = js.native
  
  /* private */ var _canBeValue: Any = js.native
  
  /* private */ var _contextReq: Any = js.native
  
  /* private */ var _declaresFields: Any = js.native
  
  /* private */ var _describes: Any = js.native
  
  var _id: Any = js.native
  
  /* private */ var _inheritsValueFromContext: Any = js.native
  
  /* private */ var _isFromParentKey: Any = js.native
  
  /* private */ var _isFromParentValue: Any = js.native
  
  /* private */ var _isInherited: Any = js.native
  
  /* private */ var _key: Any = js.native
  
  /* private */ var _newInstanceName: Any = js.native
  
  /* private */ var _noDirectParse: Any = js.native
  
  /* private */ var _oftenKeys: Any = js.native
  
  /* private */ var _selfNode: Any = js.native
  
  /* private */ var _suggester: Any = js.native
  
  /* private */ var _vprovider: Any = js.native
  
  def addChildValueConstraint(c: ChildValueConstraint): Unit = js.native
  
  def canBeValue(): Boolean = js.native
  
  def childRestrictions(): Array = js.native
  
  def describedAnnotation(): String = js.native
  
  def describesAnnotation(): Boolean = js.native
  
  /* private */ var determinesChildValues: Any = js.native
  
  def enumOptions(): Array = js.native
  
  def getCanBeDuplicator(): Boolean = js.native
  
  def getChildValueConstraints(): Array = js.native
  
  def getClassIdentifier(): Array = js.native
  
  def getContextRequirements(): Array = js.native
  
  def getOftenKeys(): Array = js.native
  
  def groupName(): String = js.native
  
  def id(): Any = js.native
  
  def inheritedContextValue(): String = js.native
  
  def isAllowNull(): Boolean = js.native
  
  def isAnnotation(): Boolean = js.native
  
  def isFromParentKey(): Boolean = js.native
  
  def isFromParentValue(): Boolean = js.native
  
  def isInherited(): Boolean = js.native
  
  /**
    * TODO THIS STUFF SHOULD BE MORE ABSTRACT (LATER...)
    * @param keyShouldStartFrom
    * @returns {Property}
    */
  def isKey(): Boolean = js.native
  
  def isMerged(): Boolean = js.native
  
  def isNoDirectParse(): Boolean = js.native
  
  def isPrimitive(): Boolean = js.native
  
  def isReference(): Boolean = js.native
  
  def isSelfNode(): Boolean = js.native
  
  def isThisPropertyDeclaresTypeFields(): Boolean = js.native
  
  def key(): Any = js.native
  
  def matchKey(k: String): Boolean = js.native
  
  def merge(): this.type = js.native
  
  def newInstanceName(): String = js.native
  
  def referencesTo(): IType = js.native
  
  def setCanBeDuplicator(): Boolean = js.native
  
  def setValueDocProvider(v: IValueDocProvider): this.type = js.native
  
  def setValueSuggester(s: IValueSuggester): Unit = js.native
  
  def suggester(): IValueSuggester = js.native
  
  def unmerge(): this.type = js.native
  
  def valueDocProvider(): IValueDocProvider = js.native
  
  def withAllowNull(): Unit = js.native
  
  def withCanBeValue(): this.type = js.native
  
  def withContextRequirement(name: String, value: String): Unit = js.native
  
  def withDescribes(a: String): this.type = js.native
  
  def withFromParentKey(): this.type = js.native
  def withFromParentKey(v: Boolean): this.type = js.native
  
  def withFromParentValue(): this.type = js.native
  def withFromParentValue(v: Boolean): this.type = js.native
  
  def withGroupName(gname: String): this.type = js.native
  
  def withInherited(w: Boolean): Unit = js.native
  
  def withInheritedContextValue(v: String): this.type = js.native
  
  def withKey(isKey: Boolean): this.type = js.native
  
  def withNewInstanceName(name: String): this.type = js.native
  
  def withNoDirectParse(): Unit = js.native
  
  def withOftenKeys(keys: Array): this.type = js.native
  
  def withSelfNode(): Unit = js.native
  
  def withThisPropertyDeclaresFields(): this.type = js.native
  def withThisPropertyDeclaresFields(b: Boolean): this.type = js.native
}
/* static members */
object Property {
  
  @JSImport("raml-definition-system", "Property")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-definition-system", "Property.CLASS_IDENTIFIER_Property_def")
  @js.native
  def CLASS_IDENTIFIER_Property_def: Any = js.native
  inline def CLASS_IDENTIFIER_Property_def_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_Property_def")(x.asInstanceOf[js.Any])
  
  inline def isInstance(instance: Any): /* is raml-definition-system.raml-definition-system.Property */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-definition-system.raml-definition-system.Property */ Boolean]
}
