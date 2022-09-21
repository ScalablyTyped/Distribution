package typings.ramlDefinitionSystem.ramlDefinitionSystemMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-definition-system", "RAMLPropertyService")
@js.native
open class RAMLPropertyService protected () extends RAMLPropertyParserService {
  def this(_property: IProperty) = this()
  
  /* private */ var _meta: Any = js.native
  
  /* private */ var _property: Any = js.native
  
  /* private */ var _propertyGrammarType: Any = js.native
  
  def domain(): ITypeDefinition = js.native
  
  var example: Boolean = js.native
  
  def getPropertyGrammarType(): String = js.native
  
  def id(): String = js.native
  
  def isAllowNull(): Boolean = js.native
  
  def isDescriminating(): Boolean = js.native
  
  def isExampleProperty(): Boolean = js.native
  
  def isKey(): Boolean = js.native
  
  def isMerged(): Boolean = js.native
  
  def isReference(): Boolean = js.native
  
  def isTypeExpr(): Boolean = js.native
  
  def meta(key: String): Any = js.native
  
  def nameId(): String = js.native
  
  def priority(): Double = js.native
  
  def putMeta(key: String, value: Any): Unit = js.native
  
  def range(): ITypeDefinition = js.native
  
  def referencesTo(): ITypeDefinition = js.native
  
  def setExample(e: Boolean): Unit = js.native
  
  def setTypeExpression(e: Boolean): Unit = js.native
  
  var texpr: Boolean = js.native
  
  def valueDocProvider(): IValueDocProvider = js.native
  
  def withPropertyGrammarType(pt: String): Unit = js.native
}
