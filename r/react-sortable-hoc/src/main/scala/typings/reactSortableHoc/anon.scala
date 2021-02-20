package typings.reactSortableHoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cancel extends StObject {
    
    var cancel: js.UndefOr[js.Array[Double]] = js.native
    
    var down: js.UndefOr[js.Array[Double]] = js.native
    
    var drop: js.UndefOr[js.Array[Double]] = js.native
    
    var lift: js.UndefOr[js.Array[Double]] = js.native
    
    var up: js.UndefOr[js.Array[Double]] = js.native
  }
  object Cancel {
    
    @scala.inline
    def apply(): Cancel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cancel]
    }
    
    @scala.inline
    implicit class CancelMutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: js.Array[Double]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCancelVarargs(value: Double*): Self = StObject.set(x, "cancel", js.Array(value :_*))
      
      @scala.inline
      def setDown(value: js.Array[Double]): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      @scala.inline
      def setDownVarargs(value: Double*): Self = StObject.set(x, "down", js.Array(value :_*))
      
      @scala.inline
      def setDrop(value: js.Array[Double]): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      @scala.inline
      def setDropVarargs(value: Double*): Self = StObject.set(x, "drop", js.Array(value :_*))
      
      @scala.inline
      def setLift(value: js.Array[Double]): Self = StObject.set(x, "lift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiftUndefined: Self = StObject.set(x, "lift", js.undefined)
      
      @scala.inline
      def setLiftVarargs(value: Double*): Self = StObject.set(x, "lift", js.Array(value :_*))
      
      @scala.inline
      def setUp(value: js.Array[Double]): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
      
      @scala.inline
      def setUpVarargs(value: Double*): Self = StObject.set(x, "up", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TagName extends StObject {
    
    var tagName: String = js.native
  }
  object TagName {
    
    @scala.inline
    def apply(tagName: String): TagName = {
      val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagName]
    }
    
    @scala.inline
    implicit class TagNameMutableBuilder[Self <: TagName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Target extends StObject {
    
    var target: TagName = js.native
  }
  object Target {
    
    @scala.inline
    def apply(target: TagName): Target = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    @scala.inline
    implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget(value: TagName): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
