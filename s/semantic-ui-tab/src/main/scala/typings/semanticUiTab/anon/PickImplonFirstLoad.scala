package typings.semanticUiTab.anon

import typings.semanticUiTab.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'onFirstLoad'> */
trait PickImplonFirstLoad extends StObject {
  
  def onFirstLoad(tabPath: String, parameterArray: js.Array[js.Any], historyEvent: js.Any): Unit
  @JSName("onFirstLoad")
  var onFirstLoad_Original: js.ThisFunction3[
    /* this */ JQuery, 
    /* tabPath */ String, 
    /* parameterArray */ js.Array[js.Any], 
    /* historyEvent */ js.Any, 
    Unit
  ]
}
object PickImplonFirstLoad {
  
  inline def apply(
    onFirstLoad: js.ThisFunction3[
      /* this */ JQuery, 
      /* tabPath */ String, 
      /* parameterArray */ js.Array[js.Any], 
      /* historyEvent */ js.Any, 
      Unit
    ]
  ): PickImplonFirstLoad = {
    val __obj = js.Dynamic.literal(onFirstLoad = onFirstLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonFirstLoad]
  }
  
  extension [Self <: PickImplonFirstLoad](x: Self) {
    
    inline def setOnFirstLoad(
      value: js.ThisFunction3[
          /* this */ JQuery, 
          /* tabPath */ String, 
          /* parameterArray */ js.Array[js.Any], 
          /* historyEvent */ js.Any, 
          Unit
        ]
    ): Self = StObject.set(x, "onFirstLoad", value.asInstanceOf[js.Any])
  }
}
