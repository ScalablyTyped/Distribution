package typings.ramlDefinitionSystem.ramlDefinitionSystemMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-definition-system", "RAMLService")
@js.native
open class RAMLService protected () extends StObject {
  def this(d: ITypeDefinition) = this()
  
  /* private */ var _actuallyExports: Any = js.native
  
  var _aliases: Array = js.native
  
  /* private */ var _allowsAnyChildren: Any = js.native
  
  /* private */ var _allowsOptionalProperties: Any = js.native
  
  /* private */ var _allowsValue: Any = js.native
  
  /* private */ var _allowsValueSet: Any = js.native
  
  /* private */ var _annotationChecked: Any = js.native
  
  /* private */ var _canInherit: Any = js.native
  
  var _consumesRef: Boolean = js.native
  
  /* private */ var _contextRequirements: Any = js.native
  
  /* private */ var _convertsToGlobal: Any = js.native
  
  /* private */ var _declaredBy: Any = js.native
  
  /* private */ var _declaresType: Any = js.native
  
  var _defining: Array = js.native
  
  /* private */ var _fDesc: Any = js.native
  
  /* private */ var _isAnnotation: Any = js.native
  
  /* private */ var _isTemplate: Any = js.native
  
  /* private */ var _node: Any = js.native
  
  /* private */ var _possibleInterfaces: Any = js.native
  
  /* private */ var _referenceIs: Any = js.native
  
  /* private */ var _representationOf: Any = js.native
  
  /* private */ var _runtimeExtenders: Any = js.native
  
  /* private */ var _type: Any = js.native
  
  def addAlias(al: String): Unit = js.native
  
  def allowValue(): Boolean = js.native
  
  def definingPropertyIsEnough(v: String): Unit = js.native
  
  def descriminatorValue(): String = js.native
  
  def findMembersDeterminer(): IProperty = js.native
  
  def getActuallyExports(): String = js.native
  
  def getAliases(): Array = js.native
  
  def getAllowAny(): Boolean = js.native
  
  def getAllowQuestion(): Boolean = js.native
  
  def getCanInherit(): Array = js.native
  
  def getConsumesRefs(): Boolean = js.native
  
  def getContextRequirements(): Array = js.native
  
  def getConvertsToGlobal(): String = js.native
  
  def getDeclaringNode(): Any = js.native
  
  def getDefining(): Array = js.native
  
  def getExtendedType(): ITypeDefinition = js.native
  
  def getKeyProp(): IProperty = js.native
  
  def getPath(): String = js.native
  
  def getReferenceIs(): String = js.native
  
  def getRepresentationOf(): ITypeDefinition = js.native
  
  def getRuntimeExtenders(): Array = js.native
  
  def globallyDeclaredBy(): Array = js.native
  
  def isAnnotation(): Boolean = js.native
  
  def isAssignableFrom(name: String): Boolean = js.native
  
  def isDeclaration(): Boolean = js.native
  
  def isGlobalDeclaration(): Boolean = js.native
  
  def isInlinedTemplates(): Boolean = js.native
  
  def isTypeSystemMember(): Boolean = js.native
  
  def isUserDefined(): Boolean = js.native
  
  def key(): Named = js.native
  
  def nameId(): String = js.native
  
  def possibleInterfaces(): Array = js.native
  
  def registerPossibleInterfaces(classNames: Array): Unit = js.native
  
  def registerSupertypes(classNames: Array): Unit = js.native
  
  def setConsumesRefs(b: Boolean): Unit = js.native
  
  def setDeclaringNode(n: Any): Unit = js.native
  
  def setExtendedTypeName(name: String): Unit = js.native
  
  def setGloballyDeclaredBy(c: NodeClass): Unit = js.native
  
  def setInlinedTemplates(b: Boolean): this.type = js.native
  
  def universe(): Universe = js.native
  
  def valueRequirements(): Array = js.native
  
  def withActuallyExports(pname: String): Unit = js.native
  
  def withAllowAny(): Unit = js.native
  
  def withAllowQuestion(): Unit = js.native
  
  def withCanInherit(clazz: String): Unit = js.native
  
  def withContextRequirement(name: String, value: String): Unit = js.native
  
  def withConvertsToGlobal(pname: String): Unit = js.native
  
  def withReferenceIs(fname: String): Unit = js.native
}
