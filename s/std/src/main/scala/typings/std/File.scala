package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about files and allows JavaScript in a web page to access their content.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/File)
  */
@js.native
trait File
  extends StObject
     with Blob {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/File/lastModified) */
  /* standard dom */
  val lastModified: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/File/name) */
  /* standard dom */
  val name: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/File/webkitRelativePath) */
  /* standard dom */
  val webkitRelativePath: java.lang.String = js.native
}
