package typings.pulumiAws.applicationloadbalancingListenerCertificateMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerCertificateState extends js.Object {
  
  /**
    * The ARN of the certificate to attach to the listener.
    */
  val certificateArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the listener to which to attach the certificate.
    */
  val listenerArn: js.UndefOr[Input[String]] = js.native
}
object ListenerCertificateState {
  
  @scala.inline
  def apply(): ListenerCertificateState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerCertificateState]
  }
  
  @scala.inline
  implicit class ListenerCertificateStateOps[Self <: ListenerCertificateState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCertificateArn(value: Input[String]): Self = this.set("certificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateArn: Self = this.set("certificateArn", js.undefined)
    
    @scala.inline
    def setListenerArn(value: Input[String]): Self = this.set("listenerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListenerArn: Self = this.set("listenerArn", js.undefined)
  }
}
