package typings.reactNativePaper

import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.ExpandedId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listAccordionGroupMod {
  
  /**
    * List.AccordionGroup allows to control a group of List Accordions. `id` prop for List.Accordion is required in order for group to work.
    * List.AccordionGroup can be a controlled or uncontrolled component. The example shows the uncontrolled version.
    * At most one Accordion can be expanded at a given time.
    *
    * <div class="screenshots">
    *   <img class="medium" src="screenshots/list-accordion-group.png" />
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { View, Text } from 'react-native';
    * import { List } from 'react-native-paper';
    *
    * const MyComponent = () => (
    *   <List.AccordionGroup>
    *     <List.Accordion title="Accordion 1" id="1">
    *       <List.Item title="Item 1" />
    *     </List.Accordion>
    *     <List.Accordion title="Accordion 2" id="2">
    *       <List.Item title="Item 2" />
    *     </List.Accordion>
    *     <View>
    *       <Text>
    *         List.Accordion can be wrapped because implementation uses React.Context.
    *       </Text>
    *       <List.Accordion title="Accordion 3" id="3">
    *         <List.Item title="Item 3" />
    *       </List.Accordion>
    *     </View>
    *   </List.AccordionGroup>
    * );
    *
    * export default MyComponent;
    *```
    */
  object default {
    
    inline def apply(hasExpandedIdPropOnAccordionPressChildren: Props): Element = ^.asInstanceOf[js.Dynamic].apply(hasExpandedIdPropOnAccordionPressChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/List/ListAccordionGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/List/ListAccordionGroup", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-paper/lib/typescript/components/List/ListAccordionGroup", "ListAccordionGroupContext")
  @js.native
  val ListAccordionGroupContext: Context[ListAccordionGroupContextType] = js.native
  
  type ListAccordionGroupContextType = ExpandedId | Null
  
  trait Props extends StObject {
    
    /**
      * React elements containing list accordions
      */
    var children: ReactNode
    
    /**
      * Id of the currently expanded list accordion
      */
    var expandedId: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Function to execute on selection change.
      */
    var onAccordionPress: js.UndefOr[js.Function1[/* expandedId */ String | Double, Unit]] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setExpandedId(value: String | Double): Self = StObject.set(x, "expandedId", value.asInstanceOf[js.Any])
      
      inline def setExpandedIdUndefined: Self = StObject.set(x, "expandedId", js.undefined)
      
      inline def setOnAccordionPress(value: /* expandedId */ String | Double => Unit): Self = StObject.set(x, "onAccordionPress", js.Any.fromFunction1(value))
      
      inline def setOnAccordionPressUndefined: Self = StObject.set(x, "onAccordionPress", js.undefined)
    }
  }
}
