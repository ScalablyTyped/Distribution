package typings.rdfjsEnvironment

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.rdfjsTermMap.factoryMod.TermMapFactory
import typings.rdfjsTermSet.factoryMod.TermSetFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object termMapSetFactoryMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@rdfjs/environment/TermMapSetFactory", JSImport.Default)
  @js.native
  open class default () extends Factory
  @JSImport("@rdfjs/environment/TermMapSetFactory", JSImport.Default)
  @js.native
  val default: FactoryCtor = js.native
  
  @js.native
  trait Factory
    extends TermSetFactory
       with TermMapFactory
  
  @js.native
  trait FactoryCtor
    extends StObject
       with Instantiable0[Factory]
  
  type _To = FactoryCtor
  
  /* This means you don't have to write `default`, but can instead just say `termMapSetFactoryMod.foo` */
  override def _to: FactoryCtor = default
}
