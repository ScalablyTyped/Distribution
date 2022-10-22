package typings.reactI18next

import org.scalablytyped.runtime.StringDictionary
import typings.i18next.mod.FallbackOrNS
import typings.i18next.mod.Namespace
import typings.i18next.mod.i18n
import typings.react.mod.ReactElement
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object icuDotmacroMod {
  
  @JSImport("react-i18next/icu.macro", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Plural_[T, K /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N, undefined, i18next.i18next.Resources> extends infer A ? A : never */ js.Any */, N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](props: (PluralProps[T, K, N]) & NoChildren): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Plural")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def SelectOrdinal_[T, K /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N, undefined, i18next.i18next.Resources> extends infer A ? A : never */ js.Any */, N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](props: (PluralProps[T, K, N]) & NoChildren): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectOrdinal")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def Select_[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N, undefined, i18next.i18next.Resources> extends infer A ? A : never */ js.Any */, N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](props: SelectProps[K, N]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Select")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def date(strings: TemplateStringsArray, variable: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(strings.asInstanceOf[js.Any], variable.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def number(strings: TemplateStringsArray, variable: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(strings.asInstanceOf[js.Any], variable.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def plural(strings: TemplateStringsArray, variable: Double, args: ValidInterpolations*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("plural")((scala.List(strings.asInstanceOf[js.Any], variable.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[String]
  
  inline def select(strings: TemplateStringsArray, variable: String, args: ValidInterpolations*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("select")((scala.List(strings.asInstanceOf[js.Any], variable.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[String]
  
  inline def selectOrdinal(strings: TemplateStringsArray, variable: Double, args: ValidInterpolations*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOrdinal")((scala.List(strings.asInstanceOf[js.Any], variable.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[String]
  
  inline def time(strings: TemplateStringsArray, variable: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("time")(strings.asInstanceOf[js.Any], variable.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait NoChildren extends StObject {
    
    var children: js.UndefOr[scala.Nothing] = js.undefined
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: P extends keyof react-i18next.react-i18next/icu.macro.PluralSubProps<K, N>? // support the standard properties of Plural
  react-i18next.react-i18next/icu.macro.PluralSubProps<K, N>[P] : // this supports infinite $0={..} or $123={..}
  // technically it also supports $-1={..} and $2.3={..} but we don't need to
  // worry since that's invalid syntax.
  P extends / * template literal string: $${number} * / string? string | react.react.ReactElement : never}
    }}}
    */
  @js.native
  trait PluralProps[T, K /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N, undefined, i18next.i18next.Resources> extends infer A ? A : never */ js.Any */, N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */] extends StObject
  
  trait PluralSubProps[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N, undefined, i18next.i18next.Resources> extends infer A ? A : never */ js.Any */, N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */] extends StObject {
    
    var children: js.UndefOr[scala.Nothing] = js.undefined
    
    var count: Double
    
    var few: js.UndefOr[String | ReactElement] = js.undefined
    
    var i18n: js.UndefOr[typings.i18next.mod.i18n] = js.undefined
    
    var i18nKey: js.UndefOr[K] = js.undefined
    
    var many: js.UndefOr[String | ReactElement] = js.undefined
    
    var ns: js.UndefOr[N] = js.undefined
    
    var one: js.UndefOr[String | ReactElement] = js.undefined
    
    var other: String | ReactElement
    
    var two: js.UndefOr[String | ReactElement] = js.undefined
    
    var values: js.UndefOr[js.Object] = js.undefined
    
    var zero: js.UndefOr[String | ReactElement] = js.undefined
  }
  object PluralSubProps {
    
    inline def apply[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N, undefined, i18next.i18next.Resources> extends infer A ? A : never */ js.Any */, N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](count: Double, other: String | ReactElement): PluralSubProps[K, N] = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluralSubProps[K, N]]
    }
    
    extension [Self <: PluralSubProps[?, ?], K /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N, undefined, i18next.i18next.Resources> extends infer A ? A : never */ js.Any */, N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](x: Self & (PluralSubProps[K, N])) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setFew(value: String | ReactElement): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
      
      inline def setFewUndefined: Self = StObject.set(x, "few", js.undefined)
      
      inline def setI18n(value: i18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nKey(value: K): Self = StObject.set(x, "i18nKey", value.asInstanceOf[js.Any])
      
      inline def setI18nKeyUndefined: Self = StObject.set(x, "i18nKey", js.undefined)
      
      inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      inline def setMany(value: String | ReactElement): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
      
      inline def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
      
      inline def setNs(value: N): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
      
      inline def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
      
      inline def setOne(value: String | ReactElement): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
      
      inline def setOneUndefined: Self = StObject.set(x, "one", js.undefined)
      
      inline def setOther(value: String | ReactElement): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setTwo(value: String | ReactElement): Self = StObject.set(x, "two", value.asInstanceOf[js.Any])
      
      inline def setTwoUndefined: Self = StObject.set(x, "two", js.undefined)
      
      inline def setValues(value: js.Object): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setZero(value: String | ReactElement): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
      
      inline def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
    }
  }
  
  // defining it this way ensures that `other` is always defined, but allows
  // unlimited other select types.
  trait SelectProps[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N, undefined, i18next.i18next.Resources> extends infer A ? A : never */ js.Any */, N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */]
    extends StObject
       with SelectSubProps
       with SelectRequiredProps[K, N]
  object SelectProps {
    
    inline def apply[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N, undefined, i18next.i18next.Resources> extends infer A ? A : never */ js.Any */, N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](other: String | ReactElement): SelectProps[K, N] = {
      val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectProps[K, N]]
    }
  }
  
  trait SelectRequiredProps[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N, undefined, i18next.i18next.Resources> extends infer A ? A : never */ js.Any */, N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */]
    extends StObject
       with NoChildren {
    
    var i18n: js.UndefOr[typings.i18next.mod.i18n] = js.undefined
    
    var i18nKey: js.UndefOr[K] = js.undefined
    
    var ns: js.UndefOr[N] = js.undefined
    
    var other: String | ReactElement
  }
  object SelectRequiredProps {
    
    inline def apply[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N, undefined, i18next.i18next.Resources> extends infer A ? A : never */ js.Any */, N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](other: String | ReactElement): SelectRequiredProps[K, N] = {
      val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectRequiredProps[K, N]]
    }
    
    extension [Self <: SelectRequiredProps[?, ?], K /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N, undefined, i18next.i18next.Resources> extends infer A ? A : never */ js.Any */, N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](x: Self & (SelectRequiredProps[K, N])) {
      
      inline def setI18n(value: i18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nKey(value: K): Self = StObject.set(x, "i18nKey", value.asInstanceOf[js.Any])
      
      inline def setI18nKeyUndefined: Self = StObject.set(x, "i18nKey", js.undefined)
      
      inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      inline def setNs(value: N): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
      
      inline def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
      
      inline def setOther(value: String | ReactElement): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    }
  }
  
  type SelectSubProps = StringDictionary[String | ReactElement]
  
  type ValidInterpolations = ReactElement | String
}
