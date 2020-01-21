package typings.reactFilepond

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // Note that this duplicates the JS File type declaration, but is necessary
  // to avoid duplicating the name 'File' in this module
  // see: https://developer.mozilla.org/en-US/docs/Web/API/File
  // see: https://github.com/Microsoft/dtslint/issues/173
  // see: https://stackoverflow.com/q/53876793/2517147
  type ActualFileObject = typings.std.Blob with typings.reactFilepond.AnonLastModified
  type FetchServerConfigFunction = js.Function6[
    /* url */ java.lang.String, 
    /* load */ js.Function1[/* file */ typings.reactFilepond.mod.ActualFileObject, scala.Unit], 
    /* error */ js.Function1[/* errorText */ java.lang.String, scala.Unit], 
    /* progress */ typings.reactFilepond.mod.ProgressServerConfigFunction, 
    /* abort */ js.Function0[scala.Unit], 
    /* headers */ js.Function1[/* headersString */ java.lang.String, scala.Unit], 
    scala.Unit
  ]
  type LoadServerConfigFunction = js.Function6[
    /* source */ js.Any, 
    /* load */ js.Function1[/* file */ typings.reactFilepond.mod.ActualFileObject, scala.Unit], 
    /* error */ js.Function1[/* errorText */ java.lang.String, scala.Unit], 
    /* progress */ typings.reactFilepond.mod.ProgressServerConfigFunction, 
    /* abort */ js.Function0[scala.Unit], 
    /* headers */ js.Function1[/* headersString */ java.lang.String, scala.Unit], 
    scala.Unit
  ]
  type ProcessServerConfigFunction = js.Function7[
    /* fieldName */ java.lang.String, 
    /* file */ typings.reactFilepond.mod.ActualFileObject, 
    /* metadata */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* load */ js.Function1[
      /* p */ java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any], 
      scala.Unit
    ], 
    /* error */ js.Function1[/* errorText */ java.lang.String, scala.Unit], 
    /* progress */ typings.reactFilepond.mod.ProgressServerConfigFunction, 
    /* abort */ js.Function0[scala.Unit], 
    scala.Unit
  ]
  type ProgressServerConfigFunction = js.Function3[
    /* isLengthComputable */ scala.Boolean, 
    /* loadedDataAmount */ scala.Double, 
    /* totalDataAmount */ scala.Double, 
    scala.Unit
  ]
  type RestoreServerConfigFunction = js.Function6[
    /* uniqueFileId */ js.Any, 
    /* load */ js.Function1[/* file */ typings.reactFilepond.mod.ActualFileObject, scala.Unit], 
    /* error */ js.Function1[/* errorText */ java.lang.String, scala.Unit], 
    /* progress */ typings.reactFilepond.mod.ProgressServerConfigFunction, 
    /* abort */ js.Function0[scala.Unit], 
    /* headers */ js.Function1[/* headersString */ java.lang.String, scala.Unit], 
    scala.Unit
  ]
  type RevertServerConfigFunction = js.Function3[
    /* uniqueFieldId */ js.Any, 
    /* load */ js.Function0[scala.Unit], 
    /* error */ js.Function1[/* errorText */ java.lang.String, scala.Unit], 
    scala.Unit
  ]
}
