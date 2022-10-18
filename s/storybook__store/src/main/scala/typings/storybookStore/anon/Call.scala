package typings.storybookStore.anon

import typings.std.Parameters
import typings.std.Partial
import typings.storybookStore.distTs3Dot9CsfTestingUtilsTypesMod.ComposedStoryPlayFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call[TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */, TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
  
  def apply(extraArgs: Partial[TArgs]): /* import warning: importer.ImportType#apply Failed type conversion: TFramework['storyResult'] */ js.Any = js.native
  
  var args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any = js.native
  
  var parameters: Parameters[js.Function1[/* args */ Any, Any]] = js.native
  
  var play: ComposedStoryPlayFn = js.native
  
  var storyName: String = js.native
}
