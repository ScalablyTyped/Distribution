package typings.squirejs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("squirejs", JSImport.Namespace)
  @js.native
  class ^ () extends Squire {
    def this(context: String) = this()
  }
  
  object Helpers {
    
    @JSImport("squirejs", "Helpers.constructs")
    @js.native
    def constructs[T](what: T): js.Function0[js.Function0[T]] = js.native
    
    @JSImport("squirejs", "Helpers.returns")
    @js.native
    def returns[T](what: T): js.Function0[T] = js.native
  }
  
  @js.native
  trait Squire extends StObject {
    
    def clean(): Squire = js.native
    def clean(name: String): Squire = js.native
    def clean(name: js.Array[String]): Squire = js.native
    
    def mock(mocks: StringDictionary[js.Any]): Squire = js.native
    def mock(name: String, mock: js.Any): Squire = js.native
    
    def remove(): String = js.native
    
    def require(dependencies: js.Array[String], callback: js.Function): Squire = js.native
    def require(dependencies: js.Array[String], callback: js.Function, errback: js.Function): Squire = js.native
    
    def run(dependencies: js.Array[String], test: js.Function): js.Function1[/* done */ js.Function, Unit] = js.native
    
    def store(name: String): Squire = js.native
    def store(name: js.Array[String]): Squire = js.native
  }
}
