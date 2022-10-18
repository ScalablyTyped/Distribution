package typings.rcSteps

import typings.rcSteps.libInterfaceMod.Status
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Current extends StObject {
    
    var current: Double
    
    var direction: String
    
    var iconPrefix: String
    
    var initial: Double
    
    var labelPlacement: String
    
    var prefixCls: String
    
    var progressDot: Boolean
    
    var size: String
    
    var status: String
    
    var `type`: String
  }
  object Current {
    
    inline def apply(
      current: Double,
      direction: String,
      iconPrefix: String,
      initial: Double,
      labelPlacement: String,
      prefixCls: String,
      progressDot: Boolean,
      size: String,
      status: String,
      `type`: String
    ): Current = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], iconPrefix = iconPrefix.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], labelPlacement = labelPlacement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], progressDot = progressDot.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Current]
    }
    
    extension [Self <: Current](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setIconPrefix(value: String): Self = StObject.set(x, "iconPrefix", value.asInstanceOf[js.Any])
      
      inline def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setLabelPlacement(value: String): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setProgressDot(value: Boolean): Self = StObject.set(x, "progressDot", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Description extends StObject {
    
    var description: ReactNode
    
    var index: Double
    
    var status: Status
    
    var title: ReactNode
  }
  object Description {
    
    inline def apply(index: Double, status: Status): Description = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    extension [Self <: Description](x: Self) {
      
      inline def setDescription(value: ReactNode): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait Index extends StObject {
    
    var description: ReactNode
    
    var index: Double
    
    var node: ReactNode
    
    var status: Status
    
    var title: ReactNode
  }
  object Index {
    
    inline def apply(index: Double, status: Status): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    extension [Self <: Index](x: Self) {
      
      inline def setDescription(value: ReactNode): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setNode(value: ReactNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
