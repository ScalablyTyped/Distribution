package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object macie {
  
  trait S3BucketAssociationClassificationType extends StObject {
    
    /**
      * A string value indicating that Macie perform a one-time classification of all of the existing objects in the bucket.
      * The only valid value is the default value, `FULL`.
      */
    var continuous: js.UndefOr[String] = js.undefined
    
    /**
      * A string value indicating whether or not Macie performs a one-time classification of all of the existing objects in the bucket.
      * Valid values are `NONE` and `FULL`. Defaults to `NONE` indicating that Macie only classifies objects that are added after the association was created.
      */
    var oneTime: js.UndefOr[String] = js.undefined
  }
  object S3BucketAssociationClassificationType {
    
    @scala.inline
    def apply(): S3BucketAssociationClassificationType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3BucketAssociationClassificationType]
    }
    
    @scala.inline
    implicit class S3BucketAssociationClassificationTypeMutableBuilder[Self <: S3BucketAssociationClassificationType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContinuous(value: String): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
      
      @scala.inline
      def setOneTime(value: String): Self = StObject.set(x, "oneTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneTimeUndefined: Self = StObject.set(x, "oneTime", js.undefined)
    }
  }
}
