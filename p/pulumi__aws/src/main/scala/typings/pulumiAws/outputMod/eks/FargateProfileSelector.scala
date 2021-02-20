package typings.pulumiAws.outputMod.eks

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FargateProfileSelector extends StObject {
  
  /**
    * Key-value map of Kubernetes labels for selection.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Kubernetes namespace for selection.
    */
  var namespace: String = js.native
}
object FargateProfileSelector {
  
  @scala.inline
  def apply(namespace: String): FargateProfileSelector = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[FargateProfileSelector]
  }
  
  @scala.inline
  implicit class FargateProfileSelectorMutableBuilder[Self <: FargateProfileSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
  }
}
