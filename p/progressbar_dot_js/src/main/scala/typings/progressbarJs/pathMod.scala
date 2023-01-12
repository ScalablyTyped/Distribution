package typings.progressbarJs

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  // tslint:disable-next-line no-empty-interface adds members from animation contract
  @JSImport("progressbar.js/path", JSImport.Namespace)
  @js.native
  open class ^[SElement /* <: Element */] ()
    extends StObject
       with Path[SElement] {
    def this(path: SElement) = this()
    def this(path: String) = this()
    def this(
      path: SElement,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationOptions */ Any
    ) = this()
    def this(
      path: String,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationOptions */ Any
    ) = this()
    def this(
      path: Null,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationOptions */ Any
    ) = this()
  }
  
  // tslint:disable-next-line no-empty-interface adds members from animation contract
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationSupport * / any */ trait Path[SElement /* <: Element */] extends StObject {
    
    val path: js.UndefOr[SElement] = js.undefined
  }
  object Path {
    
    inline def apply[SElement /* <: Element */](): Path[SElement] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Path[SElement]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Path[?], SElement /* <: Element */] (val x: Self & Path[SElement]) extends AnyVal {
      
      inline def setPath(value: SElement): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
