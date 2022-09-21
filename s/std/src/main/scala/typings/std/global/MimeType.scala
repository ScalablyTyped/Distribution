package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MimeType")
@js.native
/* standard dom */
open class MimeType ()
  extends StObject
     with typings.std.MimeType {
  
  /**
    * Returns the MIME type's description.
    * @deprecated
    */
  /* standard dom */
  /* CompleteClass */
  override val description: java.lang.String = js.native
  
  /**
    * Returns the Plugin object that implements this MIME type.
    * @deprecated
    */
  /* standard dom */
  /* CompleteClass */
  override val enabledPlugin: typings.std.Plugin = js.native
  
  /**
    * Returns the MIME type's typical file extensions, in a comma-separated list.
    * @deprecated
    */
  /* standard dom */
  /* CompleteClass */
  override val suffixes: java.lang.String = js.native
  
  /**
    * Returns the MIME type.
    * @deprecated
    */
  /* standard dom */
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
}
