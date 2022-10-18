package typings.rxjs

import typings.rxjs.anon.Elapsed
import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.TimestampProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalObservableDomAnimationFramesMod {
  
  @JSImport("rxjs/internal/observable/dom/animationFrames", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def animationFrames(): Observable[Elapsed] = ^.asInstanceOf[js.Dynamic].applyDynamic("animationFrames")().asInstanceOf[Observable[Elapsed]]
  inline def animationFrames(timestampProvider: TimestampProvider): Observable[Elapsed] = ^.asInstanceOf[js.Dynamic].applyDynamic("animationFrames")(timestampProvider.asInstanceOf[js.Any]).asInstanceOf[Observable[Elapsed]]
}
