package typings.sparqljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("sparqljs", "Generator")
@js.native
class Generator ()
  extends StObject
     with SparqlGenerator {
  def this(options: GeneratorOptions) = this()
  
  /* CompleteClass */
  override def createGenerator(): js.Any = js.native
  
  /* CompleteClass */
  override def stringify(query: SparqlQuery): String = js.native
}
