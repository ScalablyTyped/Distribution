package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stampitLib {
  /** Any composable object (stamp or descriptor) */
  type Composable = /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify stampit.Stamp */ js.Any
  /**
    * Composer function
    */
  type Composer = js.Function1[/* hasStampComposables */ Anon_Stamp, js.Any]
  type Init = js.Function2[
    /* factoryArg */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Context */ /* ctx */ js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Context */ js.Any
    ], 
    js.Any
  ]
  /** Stampit Composable for main stampit() function */
  type StampitComposable = /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify stampit.Stamp */ js.Any
}
