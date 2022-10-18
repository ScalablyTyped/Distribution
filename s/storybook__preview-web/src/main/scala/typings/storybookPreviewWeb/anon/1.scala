package typings.storybookPreviewWeb.anon

import typings.storybookPreviewWeb.distTs3Dot9PreviewWebMod.MaybePromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  def getProjectAnnotations(): MaybePromise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
  ]
}
object `1` {
  
  inline def apply(
    getProjectAnnotations: () => MaybePromise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
    ]
  ): `1` = {
    val __obj = js.Dynamic.literal(getProjectAnnotations = js.Any.fromFunction0(getProjectAnnotations))
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setGetProjectAnnotations(
      value: () => MaybePromise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
        ]
    ): Self = StObject.set(x, "getProjectAnnotations", js.Any.fromFunction0(value))
  }
}
