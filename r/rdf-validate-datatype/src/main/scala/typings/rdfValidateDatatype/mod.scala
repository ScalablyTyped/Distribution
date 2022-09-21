package typings.rdfValidateDatatype

import typings.rdfjsTypes.dataModelMod.NamedNode
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rdf-validate-datatype", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rdf-validate-datatype", "validateQuad")
  @js.native
  def validateQuad: js.Function1[/* quad */ Quad, Boolean] = js.native
  inline def validateQuad(quad: Quad): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateQuad")(quad.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def validateQuad_=(x: js.Function1[/* quad */ Quad, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateQuad")(x.asInstanceOf[js.Any])
  
  @JSImport("rdf-validate-datatype", "validateTerm")
  @js.native
  def validateTerm: js.Function1[/* term */ Term, Boolean] = js.native
  inline def validateTerm(term: Term): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateTerm")(term.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def validateTerm_=(x: js.Function1[/* term */ Term, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateTerm")(x.asInstanceOf[js.Any])
  
  @JSImport("rdf-validate-datatype", "validators")
  @js.native
  def validators: Registry = js.native
  inline def validators_=(x: Registry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validators")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Registry extends StObject {
    
    def find(): ValidatorFunc | Null = js.native
    def find(datatype: NamedNode[String]): ValidatorFunc | Null = js.native
    
    def register(datatype: NamedNode[String], validatorFunc: ValidatorFunc): Unit = js.native
  }
  
  type ValidatorFunc = js.Function1[/* value */ String, Boolean]
}
