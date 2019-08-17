package typings.reactDashFilepond

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashFilepondMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.reactDashFilepond.Anon_LastModified
  import typings.std.Blob

  // Note that this duplicates the JS File type declaration, but is necessary
  // to avoid duplicating the name 'File' in this module
  // see: https://developer.mozilla.org/en-US/docs/Web/API/File
  // see: https://github.com/Microsoft/dtslint/issues/173
  // see: https://stackoverflow.com/q/53876793/2517147
  type ActualFileObject = Blob with Anon_LastModified
  type FetchServerConfigFunction = js.Function6[
    /* url */ String, 
    /* load */ js.Function1[/* file */ ActualFileObject, Unit], 
    /* error */ js.Function1[/* errorText */ String, Unit], 
    /* progress */ ProgressServerConfigFunction, 
    /* abort */ js.Function0[Unit], 
    /* headers */ js.Function1[/* headersString */ String, Unit], 
    Unit
  ]
  type LoadServerConfigFunction = js.Function6[
    /* source */ js.Any, 
    /* load */ js.Function1[/* file */ ActualFileObject, Unit], 
    /* error */ js.Function1[/* errorText */ String, Unit], 
    /* progress */ ProgressServerConfigFunction, 
    /* abort */ js.Function0[Unit], 
    /* headers */ js.Function1[/* headersString */ String, Unit], 
    Unit
  ]
  type ProcessServerConfigFunction = js.Function7[
    /* fieldName */ String, 
    /* file */ ActualFileObject, 
    /* metadata */ StringDictionary[js.Any], 
    /* load */ js.Function1[/* p */ String | StringDictionary[js.Any], Unit], 
    /* error */ js.Function1[/* errorText */ String, Unit], 
    /* progress */ ProgressServerConfigFunction, 
    /* abort */ js.Function0[Unit], 
    Unit
  ]
  type ProgressServerConfigFunction = js.Function3[
    /* isLengthComputable */ Boolean, 
    /* loadedDataAmount */ Double, 
    /* totalDataAmount */ Double, 
    Unit
  ]
  type RestoreServerConfigFunction = js.Function6[
    /* uniqueFileId */ js.Any, 
    /* load */ js.Function1[/* file */ ActualFileObject, Unit], 
    /* error */ js.Function1[/* errorText */ String, Unit], 
    /* progress */ ProgressServerConfigFunction, 
    /* abort */ js.Function0[Unit], 
    /* headers */ js.Function1[/* headersString */ String, Unit], 
    Unit
  ]
  type RevertServerConfigFunction = js.Function3[
    /* uniqueFieldId */ js.Any, 
    /* load */ js.Function0[Unit], 
    /* error */ js.Function1[/* errorText */ String, Unit], 
    Unit
  ]
}
