package typings.storybookReactDocgenTypescriptPlugin

import typings.webpack.mod.Hash
import typings.webpack.mod.UpdateHashContextDependency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dependencyMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NullDependency * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NullDependency * / any */ @JSImport("@storybook/react-docgen-typescript-plugin/dist/dependency", "DocGenDependency")
  @js.native
  open class DocGenDependency protected () extends StObject {
    def this(codeBlock: String) = this()
    
    var codeBlock: String = js.native
    
    def deserialize(context: Context): Unit = js.native
    
    def getModuleEvaluationSideEffectsState(): Boolean = js.native
    
    def serialize(context: Context): Unit = js.native
    
    def `type`: String = js.native
    
    def updateHash(hash: Hash, context: UpdateHashContextDependency): Unit = js.native
    @JSName("updateHash")
    var updateHash_Original: js.Function2[/* hash */ Hash, /* context */ UpdateHashContextDependency, Unit] = js.native
  }
  
  trait Context extends StObject {
    
    def read(): String
    
    def write(a: String): Unit
  }
  object Context {
    
    inline def apply(read: () => String, write: String => Unit): Context = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setRead(value: () => String): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      inline def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
