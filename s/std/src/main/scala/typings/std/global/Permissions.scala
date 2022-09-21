package typings.std.global

import typings.std.PermissionDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Permissions")
@js.native
/* standard dom */
open class Permissions ()
  extends StObject
     with typings.std.Permissions {
  
  /* standard dom */
  /* CompleteClass */
  override def query(permissionDesc: PermissionDescriptor): js.Promise[typings.std.PermissionStatus] = js.native
}
