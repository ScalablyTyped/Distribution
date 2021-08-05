package typings.semanticUiTab.anon

import typings.semanticUiTab.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'onLoad'> */
trait PickImplonLoad extends StObject {
  
  def onLoad(tabPath: String, parameterArray: js.Array[js.Any], historyEvent: js.Any): Unit
  @JSName("onLoad")
  var onLoad_Original: js.ThisFunction3[
    /* this */ JQuery, 
    /* tabPath */ String, 
    /* parameterArray */ js.Array[js.Any], 
    /* historyEvent */ js.Any, 
    Unit
  ]
}
object PickImplonLoad {
  
  inline def apply(
    onLoad: js.ThisFunction3[
      /* this */ JQuery, 
      /* tabPath */ String, 
      /* parameterArray */ js.Array[js.Any], 
      /* historyEvent */ js.Any, 
      Unit
    ]
  ): PickImplonLoad = {
    val __obj = js.Dynamic.literal(onLoad = onLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonLoad]
  }
  
  extension [Self <: PickImplonLoad](x: Self) {
    
    inline def setOnLoad(
      value: js.ThisFunction3[
          /* this */ JQuery, 
          /* tabPath */ String, 
          /* parameterArray */ js.Array[js.Any], 
          /* historyEvent */ js.Any, 
          Unit
        ]
    ): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
  }
}
