package typings.storybookComponents

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.ComponentProps
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.std.Error
import typings.std.HTMLDivElement
import typings.storybookComponents.anon.Complete
import typings.storybookComponents.anon.PickDetailedHTMLPropsHTML
import typings.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderMod {
  
  @JSImport("@storybook/components/dist/Loader/Loader", "Loader")
  @js.native
  val Loader: FunctionComponent[
    ComponentProps[
      FunctionComponent[
        LoaderProps & (ComponentProps[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ProgressWrapper */ js.Any
        ])
      ]
    ]
  ] = js.native
  
  @JSImport("@storybook/components/dist/Loader/Loader", "PureLoader")
  @js.native
  val PureLoader: FunctionComponent[
    LoaderProps & (ComponentProps[
      StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
        PickDetailedHTMLPropsHTML, 
        Theme
      ]
    ])
  ] = js.native
  
  trait LoaderProps extends StObject {
    
    var error: js.UndefOr[Error] = js.undefined
    
    var progress: js.UndefOr[Progress] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object LoaderProps {
    
    inline def apply(): LoaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderProps]
    }
    
    extension [Self <: LoaderProps](x: Self) {
      
      inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setProgress(value: Progress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait Progress extends StObject {
    
    var message: String
    
    var modules: js.UndefOr[Complete] = js.undefined
    
    var value: Double
  }
  object Progress {
    
    inline def apply(message: String, value: Double): Progress = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Progress]
    }
    
    extension [Self <: Progress](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setModules(value: Complete): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
