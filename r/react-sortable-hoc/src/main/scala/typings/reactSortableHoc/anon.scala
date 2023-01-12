package typings.reactSortableHoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cancel extends StObject {
    
    var cancel: js.UndefOr[js.Array[Double]] = js.undefined
    
    var down: js.UndefOr[js.Array[Double]] = js.undefined
    
    var drop: js.UndefOr[js.Array[Double]] = js.undefined
    
    var lift: js.UndefOr[js.Array[Double]] = js.undefined
    
    var up: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object Cancel {
    
    inline def apply(): Cancel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cancel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: js.Array[Double]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCancelVarargs(value: Double*): Self = StObject.set(x, "cancel", js.Array(value*))
      
      inline def setDown(value: js.Array[Double]): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
      
      inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      inline def setDownVarargs(value: Double*): Self = StObject.set(x, "down", js.Array(value*))
      
      inline def setDrop(value: js.Array[Double]): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
      
      inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      inline def setDropVarargs(value: Double*): Self = StObject.set(x, "drop", js.Array(value*))
      
      inline def setLift(value: js.Array[Double]): Self = StObject.set(x, "lift", value.asInstanceOf[js.Any])
      
      inline def setLiftUndefined: Self = StObject.set(x, "lift", js.undefined)
      
      inline def setLiftVarargs(value: Double*): Self = StObject.set(x, "lift", js.Array(value*))
      
      inline def setUp(value: js.Array[Double]): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      
      inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
      
      inline def setUpVarargs(value: Double*): Self = StObject.set(x, "up", js.Array(value*))
    }
  }
  
  trait TagName extends StObject {
    
    var tagName: String
  }
  object TagName {
    
    inline def apply(tagName: String): TagName = {
      val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TagName] (val x: Self) extends AnyVal {
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Target extends StObject {
    
    var target: TagName
  }
  object Target {
    
    inline def apply(target: TagName): Target = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
      
      inline def setTarget(value: TagName): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
