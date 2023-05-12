package typings.rcInput

import typings.rcInput.esInterfaceMod.DataAttr
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var affixWrapper: js.UndefOr[DataAttr] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setAffixWrapper(value: DataAttr): Self = StObject.set(x, "affixWrapper", value.asInstanceOf[js.Any])
      
      inline def setAffixWrapperUndefined: Self = StObject.set(x, "affixWrapper", js.undefined)
    }
  }
  
  trait AffixWrapper extends StObject {
    
    var affixWrapper: js.UndefOr[String] = js.undefined
    
    var group: js.UndefOr[String] = js.undefined
    
    var wrapper: js.UndefOr[String] = js.undefined
  }
  object AffixWrapper {
    
    inline def apply(): AffixWrapper = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AffixWrapper]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AffixWrapper] (val x: Self) extends AnyVal {
      
      inline def setAffixWrapper(value: String): Self = StObject.set(x, "affixWrapper", value.asInstanceOf[js.Any])
      
      inline def setAffixWrapperUndefined: Self = StObject.set(x, "affixWrapper", js.undefined)
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setWrapper(value: String): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  trait ClearIcon extends StObject {
    
    var clearIcon: js.UndefOr[ReactNode] = js.undefined
  }
  object ClearIcon {
    
    inline def apply(): ClearIcon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearIcon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClearIcon] (val x: Self) extends AnyVal {
      
      inline def setClearIcon(value: ReactNode): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      inline def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
    }
  }
  
  trait Count extends StObject {
    
    var count: Double
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var value: String
  }
  object Count {
    
    inline def apply(count: Double, value: String): Count = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait CountInput extends StObject {
    
    var count: js.UndefOr[CSSProperties] = js.undefined
    
    var input: js.UndefOr[CSSProperties] = js.undefined
  }
  object CountInput {
    
    inline def apply(): CountInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CountInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CountInput] (val x: Self) extends AnyVal {
      
      inline def setCount(value: CSSProperties): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setInput(value: CSSProperties): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    }
  }
  
  trait Input extends StObject {
    
    var count: js.UndefOr[String] = js.undefined
    
    var input: js.UndefOr[String] = js.undefined
  }
  object Input {
    
    inline def apply(): Input = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Input]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
      
      inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    }
  }
  
  trait Prefix extends StObject {
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
  }
  object Prefix {
    
    inline def apply(): Prefix = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Prefix]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Prefix] (val x: Self) extends AnyVal {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  trait Suffix extends StObject {
    
    var prefix: js.UndefOr[CSSProperties] = js.undefined
    
    var suffix: js.UndefOr[CSSProperties] = js.undefined
  }
  object Suffix {
    
    inline def apply(): Suffix = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Suffix]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Suffix] (val x: Self) extends AnyVal {
      
      inline def setPrefix(value: CSSProperties): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSuffix(value: CSSProperties): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
}
