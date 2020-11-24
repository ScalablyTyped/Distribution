package typings.reactReconciler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-reconciler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply[Type, Props, Container, Instance, TextInstance, HydratableInstance, PublicInstance, HostContext, UpdatePayload, ChildSet, TimeoutHandle, NoTimeout](
    // tslint:disable-next-line:no-unnecessary-generics
  config: HostConfig[
      Type, 
      Props, 
      Container, 
      Instance, 
      TextInstance, 
      HydratableInstance, 
      PublicInstance, 
      HostContext, 
      UpdatePayload, 
      ChildSet, 
      TimeoutHandle, 
      NoTimeout
    ]
  ): Reconciler[Instance, TextInstance, Container, PublicInstance] = js.native
}
