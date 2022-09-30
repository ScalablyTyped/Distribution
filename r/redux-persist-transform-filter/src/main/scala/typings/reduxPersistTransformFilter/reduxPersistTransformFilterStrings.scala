package typings.reduxPersistTransformFilter

import typings.reduxPersistTransformFilter.mod.TransformType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduxPersistTransformFilterStrings {
  
  @js.native
  sealed trait blacklist
    extends StObject
       with TransformType
  inline def blacklist: blacklist = "blacklist".asInstanceOf[blacklist]
  
  @js.native
  sealed trait whitelist
    extends StObject
       with TransformType
  inline def whitelist: whitelist = "whitelist".asInstanceOf[whitelist]
}
