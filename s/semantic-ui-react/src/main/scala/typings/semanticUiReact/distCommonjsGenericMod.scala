package typings.semanticUiReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.anon.Children
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsGenericMod {
  
  trait HtmlIframeProps
    extends StObject
       with StrictHtmlIframeProps
       with /* key */ StringDictionary[Any]
  object HtmlIframeProps {
    
    inline def apply(): HtmlIframeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HtmlIframeProps]
    }
  }
  
  trait HtmlImageProps
    extends StObject
       with StrictHtmlImageProps
       with /* key */ StringDictionary[Any]
  object HtmlImageProps {
    
    inline def apply(): HtmlImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HtmlImageProps]
    }
  }
  
  trait HtmlInputrops
    extends StObject
       with StrictHtmlInputrops
       with /* key */ StringDictionary[Any]
  object HtmlInputrops {
    
    inline def apply(): HtmlInputrops = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HtmlInputrops]
    }
  }
  
  trait HtmlLabelProps
    extends StObject
       with StrictHtmlLabelProps
       with /* key */ StringDictionary[Any]
  object HtmlLabelProps {
    
    inline def apply(): HtmlLabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HtmlLabelProps]
    }
  }
  
  trait HtmlSpanProps
    extends StObject
       with StrictHtmlSpanProps
       with /* key */ StringDictionary[Any]
  object HtmlSpanProps {
    
    inline def apply(): HtmlSpanProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HtmlSpanProps]
    }
  }
  
  object SemanticCOLORS {
    
    inline def black: "black" = "black".asInstanceOf["black"]
    
    inline def blue: "blue" = "blue".asInstanceOf["blue"]
    
    inline def brown: "brown" = "brown".asInstanceOf["brown"]
    
    inline def green: "green" = "green".asInstanceOf["green"]
    
    inline def grey: "grey" = "grey".asInstanceOf["grey"]
    
    inline def olive: "olive" = "olive".asInstanceOf["olive"]
    
    inline def orange: "orange" = "orange".asInstanceOf["orange"]
    
    inline def pink: "pink" = "pink".asInstanceOf["pink"]
    
    inline def purple: "purple" = "purple".asInstanceOf["purple"]
    
    inline def red: "red" = "red".asInstanceOf["red"]
    
    inline def teal: "teal" = "teal".asInstanceOf["teal"]
    
    inline def violet: "violet" = "violet".asInstanceOf["violet"]
    
    inline def yellow: "yellow" = "yellow".asInstanceOf["yellow"]
  }
  type SemanticCOLORS = "red" | "orange" | "yellow" | "olive" | "green" | "teal" | "blue" | "violet" | "purple" | "pink" | "brown" | "grey" | "black"
  
  object SemanticDIRECTIONALTRANSITIONS {
    
    inline def browse: "browse" = "browse".asInstanceOf["browse"]
    
    inline def `browse right`: "browse right" = ("browse right").asInstanceOf["browse right"]
    
    inline def drop: "drop" = "drop".asInstanceOf["drop"]
    
    inline def fade: "fade" = "fade".asInstanceOf["fade"]
    
    inline def `fade down`: "fade down" = ("fade down").asInstanceOf["fade down"]
    
    inline def `fade left`: "fade left" = ("fade left").asInstanceOf["fade left"]
    
    inline def `fade right`: "fade right" = ("fade right").asInstanceOf["fade right"]
    
    inline def `fade up`: "fade up" = ("fade up").asInstanceOf["fade up"]
    
    inline def `fly down`: "fly down" = ("fly down").asInstanceOf["fly down"]
    
    inline def `fly left`: "fly left" = ("fly left").asInstanceOf["fly left"]
    
    inline def `fly right`: "fly right" = ("fly right").asInstanceOf["fly right"]
    
    inline def `fly up`: "fly up" = ("fly up").asInstanceOf["fly up"]
    
    inline def `horizontal flip`: "horizontal flip" = ("horizontal flip").asInstanceOf["horizontal flip"]
    
    inline def scale: "scale" = "scale".asInstanceOf["scale"]
    
    inline def `slide down`: "slide down" = ("slide down").asInstanceOf["slide down"]
    
    inline def `slide left`: "slide left" = ("slide left").asInstanceOf["slide left"]
    
    inline def `slide right`: "slide right" = ("slide right").asInstanceOf["slide right"]
    
    inline def `slide up`: "slide up" = ("slide up").asInstanceOf["slide up"]
    
    inline def `swing down`: "swing down" = ("swing down").asInstanceOf["swing down"]
    
    inline def `swing left`: "swing left" = ("swing left").asInstanceOf["swing left"]
    
    inline def `swing right`: "swing right" = ("swing right").asInstanceOf["swing right"]
    
    inline def `swing up`: "swing up" = ("swing up").asInstanceOf["swing up"]
    
    inline def `vertical flip`: "vertical flip" = ("vertical flip").asInstanceOf["vertical flip"]
    
    inline def zoom: "zoom" = "zoom".asInstanceOf["zoom"]
  }
  // ======================================================
  // Transitions
  // ======================================================
  type SemanticDIRECTIONALTRANSITIONS = "browse" | ("browse right") | "drop" | "fade" | ("fade up") | ("fade down") | ("fade left") | ("fade right") | ("fly up") | ("fly down") | ("fly left") | ("fly right") | ("horizontal flip") | ("vertical flip") | "scale" | ("slide up") | ("slide down") | ("slide left") | ("slide right") | ("swing up") | ("swing down") | ("swing left") | ("swing right") | "zoom"
  
  object SemanticFLOATS {
    
    inline def left: "left" = "left".asInstanceOf["left"]
    
    inline def right: "right" = "right".asInstanceOf["right"]
  }
  type SemanticFLOATS = "left" | "right"
  
  object SemanticICONS {
    
    inline def `500px`: "500px" = "500px".asInstanceOf["500px"]
    
    inline def accessible: "accessible" = "accessible".asInstanceOf["accessible"]
    
    inline def accusoft: "accusoft" = "accusoft".asInstanceOf["accusoft"]
    
    inline def add: "add" = "add".asInstanceOf["add"]
    
    inline def `add circle`: "add circle" = ("add circle").asInstanceOf["add circle"]
    
    inline def `add square`: "add square" = ("add square").asInstanceOf["add square"]
    
    inline def `add to calendar`: "add to calendar" = ("add to calendar").asInstanceOf["add to calendar"]
    
    inline def `add to cart`: "add to cart" = ("add to cart").asInstanceOf["add to cart"]
    
    inline def `add user`: "add user" = ("add user").asInstanceOf["add user"]
    
    inline def `address book`: "address book" = ("address book").asInstanceOf["address book"]
    
    inline def `address book outline`: "address book outline" = ("address book outline").asInstanceOf["address book outline"]
    
    inline def `address card`: "address card" = ("address card").asInstanceOf["address card"]
    
    inline def `address card outline`: "address card outline" = ("address card outline").asInstanceOf["address card outline"]
    
    inline def adjust: "adjust" = "adjust".asInstanceOf["adjust"]
    
    inline def adn: "adn" = "adn".asInstanceOf["adn"]
    
    inline def adversal: "adversal" = "adversal".asInstanceOf["adversal"]
    
    inline def affiliatetheme: "affiliatetheme" = "affiliatetheme".asInstanceOf["affiliatetheme"]
    
    inline def alarm: "alarm" = "alarm".asInstanceOf["alarm"]
    
    inline def `alarm mute`: "alarm mute" = ("alarm mute").asInstanceOf["alarm mute"]
    
    inline def ald: "ald" = "ald".asInstanceOf["ald"]
    
    inline def algolia: "algolia" = "algolia".asInstanceOf["algolia"]
    
    inline def `align center`: "align center" = ("align center").asInstanceOf["align center"]
    
    inline def `align justify`: "align justify" = ("align justify").asInstanceOf["align justify"]
    
    inline def `align left`: "align left" = ("align left").asInstanceOf["align left"]
    
    inline def `align right`: "align right" = ("align right").asInstanceOf["align right"]
    
    inline def als: "als" = "als".asInstanceOf["als"]
    
    inline def amazon: "amazon" = "amazon".asInstanceOf["amazon"]
    
    inline def `amazon pay`: "amazon pay" = ("amazon pay").asInstanceOf["amazon pay"]
    
    inline def ambulance: "ambulance" = "ambulance".asInstanceOf["ambulance"]
    
    inline def `american sign language interpreting`: "american sign language interpreting" = ("american sign language interpreting").asInstanceOf["american sign language interpreting"]
    
    inline def amilia: "amilia" = "amilia".asInstanceOf["amilia"]
    
    inline def anchor: "anchor" = "anchor".asInstanceOf["anchor"]
    
    inline def android: "android" = "android".asInstanceOf["android"]
    
    inline def angellist: "angellist" = "angellist".asInstanceOf["angellist"]
    
    inline def `angle double down`: "angle double down" = ("angle double down").asInstanceOf["angle double down"]
    
    inline def `angle double left`: "angle double left" = ("angle double left").asInstanceOf["angle double left"]
    
    inline def `angle double right`: "angle double right" = ("angle double right").asInstanceOf["angle double right"]
    
    inline def `angle double up`: "angle double up" = ("angle double up").asInstanceOf["angle double up"]
    
    inline def `angle down`: "angle down" = ("angle down").asInstanceOf["angle down"]
    
    inline def `angle left`: "angle left" = ("angle left").asInstanceOf["angle left"]
    
    inline def `angle right`: "angle right" = ("angle right").asInstanceOf["angle right"]
    
    inline def `angle up`: "angle up" = ("angle up").asInstanceOf["angle up"]
    
    inline def angrycreative: "angrycreative" = "angrycreative".asInstanceOf["angrycreative"]
    
    inline def angular: "angular" = "angular".asInstanceOf["angular"]
    
    inline def announcement: "announcement" = "announcement".asInstanceOf["announcement"]
    
    inline def `app store`: "app store" = ("app store").asInstanceOf["app store"]
    
    inline def `app store ios`: "app store ios" = ("app store ios").asInstanceOf["app store ios"]
    
    inline def apper: "apper" = "apper".asInstanceOf["apper"]
    
    inline def apple: "apple" = "apple".asInstanceOf["apple"]
    
    inline def `apple pay`: "apple pay" = ("apple pay").asInstanceOf["apple pay"]
    
    inline def archive: "archive" = "archive".asInstanceOf["archive"]
    
    inline def `area chart`: "area chart" = ("area chart").asInstanceOf["area chart"]
    
    inline def `area graph`: "area graph" = ("area graph").asInstanceOf["area graph"]
    
    inline def `arrow alternate circle down`: "arrow alternate circle down" = ("arrow alternate circle down").asInstanceOf["arrow alternate circle down"]
    
    inline def `arrow alternate circle down outline`: "arrow alternate circle down outline" = ("arrow alternate circle down outline").asInstanceOf["arrow alternate circle down outline"]
    
    inline def `arrow alternate circle left`: "arrow alternate circle left" = ("arrow alternate circle left").asInstanceOf["arrow alternate circle left"]
    
    inline def `arrow alternate circle left outline`: "arrow alternate circle left outline" = ("arrow alternate circle left outline").asInstanceOf["arrow alternate circle left outline"]
    
    inline def `arrow alternate circle right`: "arrow alternate circle right" = ("arrow alternate circle right").asInstanceOf["arrow alternate circle right"]
    
    inline def `arrow alternate circle right outline`: "arrow alternate circle right outline" = ("arrow alternate circle right outline").asInstanceOf["arrow alternate circle right outline"]
    
    inline def `arrow alternate circle up`: "arrow alternate circle up" = ("arrow alternate circle up").asInstanceOf["arrow alternate circle up"]
    
    inline def `arrow alternate circle up outline`: "arrow alternate circle up outline" = ("arrow alternate circle up outline").asInstanceOf["arrow alternate circle up outline"]
    
    inline def `arrow circle down`: "arrow circle down" = ("arrow circle down").asInstanceOf["arrow circle down"]
    
    inline def `arrow circle left`: "arrow circle left" = ("arrow circle left").asInstanceOf["arrow circle left"]
    
    inline def `arrow circle right`: "arrow circle right" = ("arrow circle right").asInstanceOf["arrow circle right"]
    
    inline def `arrow circle up`: "arrow circle up" = ("arrow circle up").asInstanceOf["arrow circle up"]
    
    inline def `arrow down`: "arrow down" = ("arrow down").asInstanceOf["arrow down"]
    
    inline def `arrow down cart`: "arrow down cart" = ("arrow down cart").asInstanceOf["arrow down cart"]
    
    inline def `arrow left`: "arrow left" = ("arrow left").asInstanceOf["arrow left"]
    
    inline def `arrow right`: "arrow right" = ("arrow right").asInstanceOf["arrow right"]
    
    inline def `arrow up`: "arrow up" = ("arrow up").asInstanceOf["arrow up"]
    
    inline def `arrows alternate`: "arrows alternate" = ("arrows alternate").asInstanceOf["arrows alternate"]
    
    inline def `arrows alternate horizontal`: "arrows alternate horizontal" = ("arrows alternate horizontal").asInstanceOf["arrows alternate horizontal"]
    
    inline def `arrows alternate vertical`: "arrows alternate vertical" = ("arrows alternate vertical").asInstanceOf["arrows alternate vertical"]
    
    inline def asexual: "asexual" = "asexual".asInstanceOf["asexual"]
    
    inline def asl: "asl" = "asl".asInstanceOf["asl"]
    
    inline def `asl interpreting`: "asl interpreting" = ("asl interpreting").asInstanceOf["asl interpreting"]
    
    inline def `assistive listening devices`: "assistive listening devices" = ("assistive listening devices").asInstanceOf["assistive listening devices"]
    
    inline def `assistive listening systems`: "assistive listening systems" = ("assistive listening systems").asInstanceOf["assistive listening systems"]
    
    inline def asterisk: "asterisk" = "asterisk".asInstanceOf["asterisk"]
    
    inline def asymmetrik: "asymmetrik" = "asymmetrik".asInstanceOf["asymmetrik"]
    
    inline def at: "at" = "at".asInstanceOf["at"]
    
    inline def attach: "attach" = "attach".asInstanceOf["attach"]
    
    inline def attention: "attention" = "attention".asInstanceOf["attention"]
    
    inline def audible: "audible" = "audible".asInstanceOf["audible"]
    
    inline def `audio description`: "audio description" = ("audio description").asInstanceOf["audio description"]
    
    inline def autoprefixer: "autoprefixer" = "autoprefixer".asInstanceOf["autoprefixer"]
    
    inline def avianex: "avianex" = "avianex".asInstanceOf["avianex"]
    
    inline def aviato: "aviato" = "aviato".asInstanceOf["aviato"]
    
    inline def aws: "aws" = "aws".asInstanceOf["aws"]
    
    inline def backward: "backward" = "backward".asInstanceOf["backward"]
    
    inline def balance: "balance" = "balance".asInstanceOf["balance"]
    
    inline def `balance scale`: "balance scale" = ("balance scale").asInstanceOf["balance scale"]
    
    inline def ban: "ban" = "ban".asInstanceOf["ban"]
    
    inline def `band aid`: "band aid" = ("band aid").asInstanceOf["band aid"]
    
    inline def bandcamp: "bandcamp" = "bandcamp".asInstanceOf["bandcamp"]
    
    inline def bar: "bar" = "bar".asInstanceOf["bar"]
    
    inline def barcode: "barcode" = "barcode".asInstanceOf["barcode"]
    
    inline def bars: "bars" = "bars".asInstanceOf["bars"]
    
    inline def `baseball ball`: "baseball ball" = ("baseball ball").asInstanceOf["baseball ball"]
    
    inline def `basketball ball`: "basketball ball" = ("basketball ball").asInstanceOf["basketball ball"]
    
    inline def bath: "bath" = "bath".asInstanceOf["bath"]
    
    inline def bathtub: "bathtub" = "bathtub".asInstanceOf["bathtub"]
    
    inline def `battery empty`: "battery empty" = ("battery empty").asInstanceOf["battery empty"]
    
    inline def `battery four`: "battery four" = ("battery four").asInstanceOf["battery four"]
    
    inline def `battery full`: "battery full" = ("battery full").asInstanceOf["battery full"]
    
    inline def `battery half`: "battery half" = ("battery half").asInstanceOf["battery half"]
    
    inline def `battery high`: "battery high" = ("battery high").asInstanceOf["battery high"]
    
    inline def `battery low`: "battery low" = ("battery low").asInstanceOf["battery low"]
    
    inline def `battery one`: "battery one" = ("battery one").asInstanceOf["battery one"]
    
    inline def `battery quarter`: "battery quarter" = ("battery quarter").asInstanceOf["battery quarter"]
    
    inline def `battery three`: "battery three" = ("battery three").asInstanceOf["battery three"]
    
    inline def `battery three quarters`: "battery three quarters" = ("battery three quarters").asInstanceOf["battery three quarters"]
    
    inline def `battery two`: "battery two" = ("battery two").asInstanceOf["battery two"]
    
    inline def `battery zero`: "battery zero" = ("battery zero").asInstanceOf["battery zero"]
    
    inline def bed: "bed" = "bed".asInstanceOf["bed"]
    
    inline def beer: "beer" = "beer".asInstanceOf["beer"]
    
    inline def behance: "behance" = "behance".asInstanceOf["behance"]
    
    inline def `behance square`: "behance square" = ("behance square").asInstanceOf["behance square"]
    
    inline def bell: "bell" = "bell".asInstanceOf["bell"]
    
    inline def `bell outline`: "bell outline" = ("bell outline").asInstanceOf["bell outline"]
    
    inline def `bell slash`: "bell slash" = ("bell slash").asInstanceOf["bell slash"]
    
    inline def `bell slash outline`: "bell slash outline" = ("bell slash outline").asInstanceOf["bell slash outline"]
    
    inline def bicycle: "bicycle" = "bicycle".asInstanceOf["bicycle"]
    
    inline def bimobject: "bimobject" = "bimobject".asInstanceOf["bimobject"]
    
    inline def binoculars: "binoculars" = "binoculars".asInstanceOf["binoculars"]
    
    inline def birthday: "birthday" = "birthday".asInstanceOf["birthday"]
    
    inline def `birthday cake`: "birthday cake" = ("birthday cake").asInstanceOf["birthday cake"]
    
    inline def bitbucket: "bitbucket" = "bitbucket".asInstanceOf["bitbucket"]
    
    inline def `bitbucket square`: "bitbucket square" = ("bitbucket square").asInstanceOf["bitbucket square"]
    
    inline def bitcoin: "bitcoin" = "bitcoin".asInstanceOf["bitcoin"]
    
    inline def bity: "bity" = "bity".asInstanceOf["bity"]
    
    inline def `black tie`: "black tie" = ("black tie").asInstanceOf["black tie"]
    
    inline def blackberry: "blackberry" = "blackberry".asInstanceOf["blackberry"]
    
    inline def blind: "blind" = "blind".asInstanceOf["blind"]
    
    inline def `block layout`: "block layout" = ("block layout").asInstanceOf["block layout"]
    
    inline def blogger: "blogger" = "blogger".asInstanceOf["blogger"]
    
    inline def `blogger b`: "blogger b" = ("blogger b").asInstanceOf["blogger b"]
    
    inline def bluetooth: "bluetooth" = "bluetooth".asInstanceOf["bluetooth"]
    
    inline def `bluetooth alternative`: "bluetooth alternative" = ("bluetooth alternative").asInstanceOf["bluetooth alternative"]
    
    inline def `bluetooth b`: "bluetooth b" = ("bluetooth b").asInstanceOf["bluetooth b"]
    
    inline def bold: "bold" = "bold".asInstanceOf["bold"]
    
    inline def bolt: "bolt" = "bolt".asInstanceOf["bolt"]
    
    inline def bomb: "bomb" = "bomb".asInstanceOf["bomb"]
    
    inline def book: "book" = "book".asInstanceOf["book"]
    
    inline def bookmark: "bookmark" = "bookmark".asInstanceOf["bookmark"]
    
    inline def `bookmark outline`: "bookmark outline" = ("bookmark outline").asInstanceOf["bookmark outline"]
    
    inline def `bowling ball`: "bowling ball" = ("bowling ball").asInstanceOf["bowling ball"]
    
    inline def box: "box" = "box".asInstanceOf["box"]
    
    inline def boxes: "boxes" = "boxes".asInstanceOf["boxes"]
    
    inline def braille: "braille" = "braille".asInstanceOf["braille"]
    
    inline def briefcase: "briefcase" = "briefcase".asInstanceOf["briefcase"]
    
    inline def `broken chain`: "broken chain" = ("broken chain").asInstanceOf["broken chain"]
    
    inline def browser: "browser" = "browser".asInstanceOf["browser"]
    
    inline def btc: "btc" = "btc".asInstanceOf["btc"]
    
    inline def bug: "bug" = "bug".asInstanceOf["bug"]
    
    inline def building: "building" = "building".asInstanceOf["building"]
    
    inline def `building outline`: "building outline" = ("building outline").asInstanceOf["building outline"]
    
    inline def bullhorn: "bullhorn" = "bullhorn".asInstanceOf["bullhorn"]
    
    inline def bullseye: "bullseye" = "bullseye".asInstanceOf["bullseye"]
    
    inline def buromobelexperte: "buromobelexperte" = "buromobelexperte".asInstanceOf["buromobelexperte"]
    
    inline def bus: "bus" = "bus".asInstanceOf["bus"]
    
    inline def buysellads: "buysellads" = "buysellads".asInstanceOf["buysellads"]
    
    inline def calculator: "calculator" = "calculator".asInstanceOf["calculator"]
    
    inline def calendar: "calendar" = "calendar".asInstanceOf["calendar"]
    
    inline def `calendar alternate`: "calendar alternate" = ("calendar alternate").asInstanceOf["calendar alternate"]
    
    inline def `calendar alternate outline`: "calendar alternate outline" = ("calendar alternate outline").asInstanceOf["calendar alternate outline"]
    
    inline def `calendar check`: "calendar check" = ("calendar check").asInstanceOf["calendar check"]
    
    inline def `calendar check outline`: "calendar check outline" = ("calendar check outline").asInstanceOf["calendar check outline"]
    
    inline def `calendar minus`: "calendar minus" = ("calendar minus").asInstanceOf["calendar minus"]
    
    inline def `calendar minus outline`: "calendar minus outline" = ("calendar minus outline").asInstanceOf["calendar minus outline"]
    
    inline def `calendar outline`: "calendar outline" = ("calendar outline").asInstanceOf["calendar outline"]
    
    inline def `calendar plus`: "calendar plus" = ("calendar plus").asInstanceOf["calendar plus"]
    
    inline def `calendar plus outline`: "calendar plus outline" = ("calendar plus outline").asInstanceOf["calendar plus outline"]
    
    inline def `calendar times`: "calendar times" = ("calendar times").asInstanceOf["calendar times"]
    
    inline def `calendar times outline`: "calendar times outline" = ("calendar times outline").asInstanceOf["calendar times outline"]
    
    inline def call: "call" = "call".asInstanceOf["call"]
    
    inline def `call square`: "call square" = ("call square").asInstanceOf["call square"]
    
    inline def camera: "camera" = "camera".asInstanceOf["camera"]
    
    inline def `camera retro`: "camera retro" = ("camera retro").asInstanceOf["camera retro"]
    
    inline def cancel: "cancel" = "cancel".asInstanceOf["cancel"]
    
    inline def car: "car" = "car".asInstanceOf["car"]
    
    inline def `caret down`: "caret down" = ("caret down").asInstanceOf["caret down"]
    
    inline def `caret left`: "caret left" = ("caret left").asInstanceOf["caret left"]
    
    inline def `caret right`: "caret right" = ("caret right").asInstanceOf["caret right"]
    
    inline def `caret square down`: "caret square down" = ("caret square down").asInstanceOf["caret square down"]
    
    inline def `caret square down outline`: "caret square down outline" = ("caret square down outline").asInstanceOf["caret square down outline"]
    
    inline def `caret square left`: "caret square left" = ("caret square left").asInstanceOf["caret square left"]
    
    inline def `caret square left outline`: "caret square left outline" = ("caret square left outline").asInstanceOf["caret square left outline"]
    
    inline def `caret square right`: "caret square right" = ("caret square right").asInstanceOf["caret square right"]
    
    inline def `caret square right outline`: "caret square right outline" = ("caret square right outline").asInstanceOf["caret square right outline"]
    
    inline def `caret square up`: "caret square up" = ("caret square up").asInstanceOf["caret square up"]
    
    inline def `caret square up outline`: "caret square up outline" = ("caret square up outline").asInstanceOf["caret square up outline"]
    
    inline def `caret up`: "caret up" = ("caret up").asInstanceOf["caret up"]
    
    inline def cart: "cart" = "cart".asInstanceOf["cart"]
    
    inline def `cart arrow down`: "cart arrow down" = ("cart arrow down").asInstanceOf["cart arrow down"]
    
    inline def `cart plus`: "cart plus" = ("cart plus").asInstanceOf["cart plus"]
    
    inline def cc: "cc" = "cc".asInstanceOf["cc"]
    
    inline def `cc amazon pay`: "cc amazon pay" = ("cc amazon pay").asInstanceOf["cc amazon pay"]
    
    inline def `cc amex`: "cc amex" = ("cc amex").asInstanceOf["cc amex"]
    
    inline def `cc apple pay`: "cc apple pay" = ("cc apple pay").asInstanceOf["cc apple pay"]
    
    inline def `cc diners club`: "cc diners club" = ("cc diners club").asInstanceOf["cc diners club"]
    
    inline def `cc discover`: "cc discover" = ("cc discover").asInstanceOf["cc discover"]
    
    inline def `cc jcb`: "cc jcb" = ("cc jcb").asInstanceOf["cc jcb"]
    
    inline def `cc mastercard`: "cc mastercard" = ("cc mastercard").asInstanceOf["cc mastercard"]
    
    inline def `cc paypal`: "cc paypal" = ("cc paypal").asInstanceOf["cc paypal"]
    
    inline def `cc stripe`: "cc stripe" = ("cc stripe").asInstanceOf["cc stripe"]
    
    inline def `cc visa`: "cc visa" = ("cc visa").asInstanceOf["cc visa"]
    
    inline def centercode: "centercode" = "centercode".asInstanceOf["centercode"]
    
    inline def certificate: "certificate" = "certificate".asInstanceOf["certificate"]
    
    inline def chain: "chain" = "chain".asInstanceOf["chain"]
    
    inline def `chart area`: "chart area" = ("chart area").asInstanceOf["chart area"]
    
    inline def `chart bar`: "chart bar" = ("chart bar").asInstanceOf["chart bar"]
    
    inline def `chart bar outline`: "chart bar outline" = ("chart bar outline").asInstanceOf["chart bar outline"]
    
    inline def `chart line`: "chart line" = ("chart line").asInstanceOf["chart line"]
    
    inline def `chart pie`: "chart pie" = ("chart pie").asInstanceOf["chart pie"]
    
    inline def chat: "chat" = "chat".asInstanceOf["chat"]
    
    inline def check: "check" = "check".asInstanceOf["check"]
    
    inline def `check circle`: "check circle" = ("check circle").asInstanceOf["check circle"]
    
    inline def `check circle outline`: "check circle outline" = ("check circle outline").asInstanceOf["check circle outline"]
    
    inline def `check square`: "check square" = ("check square").asInstanceOf["check square"]
    
    inline def `check square outline`: "check square outline" = ("check square outline").asInstanceOf["check square outline"]
    
    inline def `checked calendar`: "checked calendar" = ("checked calendar").asInstanceOf["checked calendar"]
    
    inline def checkmark: "checkmark" = "checkmark".asInstanceOf["checkmark"]
    
    inline def `checkmark box`: "checkmark box" = ("checkmark box").asInstanceOf["checkmark box"]
    
    inline def chess: "chess" = "chess".asInstanceOf["chess"]
    
    inline def `chess bishop`: "chess bishop" = ("chess bishop").asInstanceOf["chess bishop"]
    
    inline def `chess board`: "chess board" = ("chess board").asInstanceOf["chess board"]
    
    inline def `chess king`: "chess king" = ("chess king").asInstanceOf["chess king"]
    
    inline def `chess knight`: "chess knight" = ("chess knight").asInstanceOf["chess knight"]
    
    inline def `chess pawn`: "chess pawn" = ("chess pawn").asInstanceOf["chess pawn"]
    
    inline def `chess queen`: "chess queen" = ("chess queen").asInstanceOf["chess queen"]
    
    inline def `chess rock`: "chess rock" = ("chess rock").asInstanceOf["chess rock"]
    
    inline def `chess rook`: "chess rook" = ("chess rook").asInstanceOf["chess rook"]
    
    inline def `chevron circle down`: "chevron circle down" = ("chevron circle down").asInstanceOf["chevron circle down"]
    
    inline def `chevron circle left`: "chevron circle left" = ("chevron circle left").asInstanceOf["chevron circle left"]
    
    inline def `chevron circle right`: "chevron circle right" = ("chevron circle right").asInstanceOf["chevron circle right"]
    
    inline def `chevron circle up`: "chevron circle up" = ("chevron circle up").asInstanceOf["chevron circle up"]
    
    inline def `chevron down`: "chevron down" = ("chevron down").asInstanceOf["chevron down"]
    
    inline def `chevron left`: "chevron left" = ("chevron left").asInstanceOf["chevron left"]
    
    inline def `chevron right`: "chevron right" = ("chevron right").asInstanceOf["chevron right"]
    
    inline def `chevron up`: "chevron up" = ("chevron up").asInstanceOf["chevron up"]
    
    inline def child: "child" = "child".asInstanceOf["child"]
    
    inline def chrome: "chrome" = "chrome".asInstanceOf["chrome"]
    
    inline def circle: "circle" = "circle".asInstanceOf["circle"]
    
    inline def `circle notch`: "circle notch" = ("circle notch").asInstanceOf["circle notch"]
    
    inline def `circle notched`: "circle notched" = ("circle notched").asInstanceOf["circle notched"]
    
    inline def `circle outline`: "circle outline" = ("circle outline").asInstanceOf["circle outline"]
    
    inline def `circle thin`: "circle thin" = ("circle thin").asInstanceOf["circle thin"]
    
    inline def clipboard: "clipboard" = "clipboard".asInstanceOf["clipboard"]
    
    inline def `clipboard check`: "clipboard check" = ("clipboard check").asInstanceOf["clipboard check"]
    
    inline def `clipboard list`: "clipboard list" = ("clipboard list").asInstanceOf["clipboard list"]
    
    inline def `clipboard outline`: "clipboard outline" = ("clipboard outline").asInstanceOf["clipboard outline"]
    
    inline def clock: "clock" = "clock".asInstanceOf["clock"]
    
    inline def `clock outline`: "clock outline" = ("clock outline").asInstanceOf["clock outline"]
    
    inline def `clone outline`: "clone outline" = ("clone outline").asInstanceOf["clone outline"]
    
    inline def close: "close" = "close".asInstanceOf["close"]
    
    inline def `closed captioning`: "closed captioning" = ("closed captioning").asInstanceOf["closed captioning"]
    
    inline def `closed captioning outline`: "closed captioning outline" = ("closed captioning outline").asInstanceOf["closed captioning outline"]
    
    inline def cloud: "cloud" = "cloud".asInstanceOf["cloud"]
    
    inline def `cloud download`: "cloud download" = ("cloud download").asInstanceOf["cloud download"]
    
    inline def `cloud upload`: "cloud upload" = ("cloud upload").asInstanceOf["cloud upload"]
    
    inline def cloudscale: "cloudscale" = "cloudscale".asInstanceOf["cloudscale"]
    
    inline def cloudsmith: "cloudsmith" = "cloudsmith".asInstanceOf["cloudsmith"]
    
    inline def cloudversify: "cloudversify" = "cloudversify".asInstanceOf["cloudversify"]
    
    inline def cny: "cny" = "cny".asInstanceOf["cny"]
    
    inline def cocktail: "cocktail" = "cocktail".asInstanceOf["cocktail"]
    
    inline def code: "code" = "code".asInstanceOf["code"]
    
    inline def `code branch`: "code branch" = ("code branch").asInstanceOf["code branch"]
    
    inline def codepen: "codepen" = "codepen".asInstanceOf["codepen"]
    
    inline def codiepie: "codiepie" = "codiepie".asInstanceOf["codiepie"]
    
    inline def coffee: "coffee" = "coffee".asInstanceOf["coffee"]
    
    inline def cog: "cog" = "cog".asInstanceOf["cog"]
    
    inline def cogs: "cogs" = "cogs".asInstanceOf["cogs"]
    
    inline def columns: "columns" = "columns".asInstanceOf["columns"]
    
    inline def comment: "comment" = "comment".asInstanceOf["comment"]
    
    inline def `comment alternate`: "comment alternate" = ("comment alternate").asInstanceOf["comment alternate"]
    
    inline def `comment alternate outline`: "comment alternate outline" = ("comment alternate outline").asInstanceOf["comment alternate outline"]
    
    inline def `comment outline`: "comment outline" = ("comment outline").asInstanceOf["comment outline"]
    
    inline def commenting: "commenting" = "commenting".asInstanceOf["commenting"]
    
    inline def comments: "comments" = "comments".asInstanceOf["comments"]
    
    inline def `comments outline`: "comments outline" = ("comments outline").asInstanceOf["comments outline"]
    
    inline def compass: "compass" = "compass".asInstanceOf["compass"]
    
    inline def `compass outline`: "compass outline" = ("compass outline").asInstanceOf["compass outline"]
    
    inline def compose: "compose" = "compose".asInstanceOf["compose"]
    
    inline def compress: "compress" = "compress".asInstanceOf["compress"]
    
    inline def computer: "computer" = "computer".asInstanceOf["computer"]
    
    inline def configure: "configure" = "configure".asInstanceOf["configure"]
    
    inline def connectdevelop: "connectdevelop" = "connectdevelop".asInstanceOf["connectdevelop"]
    
    inline def contao: "contao" = "contao".asInstanceOf["contao"]
    
    inline def content: "content" = "content".asInstanceOf["content"]
    
    inline def conversation: "conversation" = "conversation".asInstanceOf["conversation"]
    
    inline def copy: "copy" = "copy".asInstanceOf["copy"]
    
    inline def `copy outline`: "copy outline" = ("copy outline").asInstanceOf["copy outline"]
    
    inline def copyright: "copyright" = "copyright".asInstanceOf["copyright"]
    
    inline def `copyright outline`: "copyright outline" = ("copyright outline").asInstanceOf["copyright outline"]
    
    inline def cpanel: "cpanel" = "cpanel".asInstanceOf["cpanel"]
    
    inline def `creative commons`: "creative commons" = ("creative commons").asInstanceOf["creative commons"]
    
    inline def `credit card`: "credit card" = ("credit card").asInstanceOf["credit card"]
    
    inline def `credit card alternative`: "credit card alternative" = ("credit card alternative").asInstanceOf["credit card alternative"]
    
    inline def `credit card outline`: "credit card outline" = ("credit card outline").asInstanceOf["credit card outline"]
    
    inline def crop: "crop" = "crop".asInstanceOf["crop"]
    
    inline def crosshairs: "crosshairs" = "crosshairs".asInstanceOf["crosshairs"]
    
    inline def css3: "css3" = "css3".asInstanceOf["css3"]
    
    inline def `css3 alternate`: "css3 alternate" = ("css3 alternate").asInstanceOf["css3 alternate"]
    
    inline def cube: "cube" = "cube".asInstanceOf["cube"]
    
    inline def cubes: "cubes" = "cubes".asInstanceOf["cubes"]
    
    inline def currency: "currency" = "currency".asInstanceOf["currency"]
    
    inline def cut: "cut" = "cut".asInstanceOf["cut"]
    
    inline def cuttlefish: "cuttlefish" = "cuttlefish".asInstanceOf["cuttlefish"]
    
    inline def `d and d`: "d and d" = ("d and d").asInstanceOf["d and d"]
    
    inline def dashboard: "dashboard" = "dashboard".asInstanceOf["dashboard"]
    
    inline def dashcube: "dashcube" = "dashcube".asInstanceOf["dashcube"]
    
    inline def database: "database" = "database".asInstanceOf["database"]
    
    inline def deaf: "deaf" = "deaf".asInstanceOf["deaf"]
    
    inline def deafness: "deafness" = "deafness".asInstanceOf["deafness"]
    
    inline def delete: "delete" = "delete".asInstanceOf["delete"]
    
    inline def `delete calendar`: "delete calendar" = ("delete calendar").asInstanceOf["delete calendar"]
    
    inline def delicious: "delicious" = "delicious".asInstanceOf["delicious"]
    
    inline def deploydog: "deploydog" = "deploydog".asInstanceOf["deploydog"]
    
    inline def deskpro: "deskpro" = "deskpro".asInstanceOf["deskpro"]
    
    inline def desktop: "desktop" = "desktop".asInstanceOf["desktop"]
    
    inline def detective: "detective" = "detective".asInstanceOf["detective"]
    
    inline def deviantart: "deviantart" = "deviantart".asInstanceOf["deviantart"]
    
    inline def diamond: "diamond" = "diamond".asInstanceOf["diamond"]
    
    inline def digg: "digg" = "digg".asInstanceOf["digg"]
    
    inline def `digital ocean`: "digital ocean" = ("digital ocean").asInstanceOf["digital ocean"]
    
    inline def discord: "discord" = "discord".asInstanceOf["discord"]
    
    inline def discourse: "discourse" = "discourse".asInstanceOf["discourse"]
    
    inline def discussions: "discussions" = "discussions".asInstanceOf["discussions"]
    
    inline def disk: "disk" = "disk".asInstanceOf["disk"]
    
    inline def dna: "dna" = "dna".asInstanceOf["dna"]
    
    inline def dochub: "dochub" = "dochub".asInstanceOf["dochub"]
    
    inline def docker: "docker" = "docker".asInstanceOf["docker"]
    
    inline def doctor: "doctor" = "doctor".asInstanceOf["doctor"]
    
    inline def dollar: "dollar" = "dollar".asInstanceOf["dollar"]
    
    inline def `dollar sign`: "dollar sign" = ("dollar sign").asInstanceOf["dollar sign"]
    
    inline def dolly: "dolly" = "dolly".asInstanceOf["dolly"]
    
    inline def `dolly flatbed`: "dolly flatbed" = ("dolly flatbed").asInstanceOf["dolly flatbed"]
    
    inline def dont: "dont" = "dont".asInstanceOf["dont"]
    
    inline def `dot circle`: "dot circle" = ("dot circle").asInstanceOf["dot circle"]
    
    inline def `dot circle outline`: "dot circle outline" = ("dot circle outline").asInstanceOf["dot circle outline"]
    
    inline def download: "download" = "download".asInstanceOf["download"]
    
    inline def draft2digital: "draft2digital" = "draft2digital".asInstanceOf["draft2digital"]
    
    inline def dribbble: "dribbble" = "dribbble".asInstanceOf["dribbble"]
    
    inline def `dribbble square`: "dribbble square" = ("dribbble square").asInstanceOf["dribbble square"]
    
    inline def `drivers license`: "drivers license" = ("drivers license").asInstanceOf["drivers license"]
    
    inline def dropbox: "dropbox" = "dropbox".asInstanceOf["dropbox"]
    
    inline def dropdown: "dropdown" = "dropdown".asInstanceOf["dropdown"]
    
    inline def drupal: "drupal" = "drupal".asInstanceOf["drupal"]
    
    inline def dyalog: "dyalog" = "dyalog".asInstanceOf["dyalog"]
    
    inline def earlybirds: "earlybirds" = "earlybirds".asInstanceOf["earlybirds"]
    
    inline def edge: "edge" = "edge".asInstanceOf["edge"]
    
    inline def edit: "edit" = "edit".asInstanceOf["edit"]
    
    inline def `edit outline`: "edit outline" = ("edit outline").asInstanceOf["edit outline"]
    
    inline def eject: "eject" = "eject".asInstanceOf["eject"]
    
    inline def elementor: "elementor" = "elementor".asInstanceOf["elementor"]
    
    inline def `ellipsis horizontal`: "ellipsis horizontal" = ("ellipsis horizontal").asInstanceOf["ellipsis horizontal"]
    
    inline def `ellipsis vertical`: "ellipsis vertical" = ("ellipsis vertical").asInstanceOf["ellipsis vertical"]
    
    inline def ember: "ember" = "ember".asInstanceOf["ember"]
    
    inline def emergency: "emergency" = "emergency".asInstanceOf["emergency"]
    
    inline def empire: "empire" = "empire".asInstanceOf["empire"]
    
    inline def envelope: "envelope" = "envelope".asInstanceOf["envelope"]
    
    inline def `envelope open`: "envelope open" = ("envelope open").asInstanceOf["envelope open"]
    
    inline def `envelope open outline`: "envelope open outline" = ("envelope open outline").asInstanceOf["envelope open outline"]
    
    inline def `envelope outline`: "envelope outline" = ("envelope outline").asInstanceOf["envelope outline"]
    
    inline def `envelope square`: "envelope square" = ("envelope square").asInstanceOf["envelope square"]
    
    inline def envira: "envira" = "envira".asInstanceOf["envira"]
    
    inline def `envira gallery`: "envira gallery" = ("envira gallery").asInstanceOf["envira gallery"]
    
    inline def erase: "erase" = "erase".asInstanceOf["erase"]
    
    inline def eraser: "eraser" = "eraser".asInstanceOf["eraser"]
    
    inline def erlang: "erlang" = "erlang".asInstanceOf["erlang"]
    
    inline def ethereum: "ethereum" = "ethereum".asInstanceOf["ethereum"]
    
    inline def etsy: "etsy" = "etsy".asInstanceOf["etsy"]
    
    inline def eur: "eur" = "eur".asInstanceOf["eur"]
    
    inline def euro: "euro" = "euro".asInstanceOf["euro"]
    
    inline def `euro sign`: "euro sign" = ("euro sign").asInstanceOf["euro sign"]
    
    inline def exchange: "exchange" = "exchange".asInstanceOf["exchange"]
    
    inline def exclamation: "exclamation" = "exclamation".asInstanceOf["exclamation"]
    
    inline def `exclamation circle`: "exclamation circle" = ("exclamation circle").asInstanceOf["exclamation circle"]
    
    inline def `exclamation triangle`: "exclamation triangle" = ("exclamation triangle").asInstanceOf["exclamation triangle"]
    
    inline def expand: "expand" = "expand".asInstanceOf["expand"]
    
    inline def `expand arrows alternate`: "expand arrows alternate" = ("expand arrows alternate").asInstanceOf["expand arrows alternate"]
    
    inline def expeditedssl: "expeditedssl" = "expeditedssl".asInstanceOf["expeditedssl"]
    
    inline def external: "external" = "external".asInstanceOf["external"]
    
    inline def `external alternate`: "external alternate" = ("external alternate").asInstanceOf["external alternate"]
    
    inline def `external share`: "external share" = ("external share").asInstanceOf["external share"]
    
    inline def `external square`: "external square" = ("external square").asInstanceOf["external square"]
    
    inline def `external square alternate`: "external square alternate" = ("external square alternate").asInstanceOf["external square alternate"]
    
    inline def eye: "eye" = "eye".asInstanceOf["eye"]
    
    inline def `eye dropper`: "eye dropper" = ("eye dropper").asInstanceOf["eye dropper"]
    
    inline def `eye slash`: "eye slash" = ("eye slash").asInstanceOf["eye slash"]
    
    inline def `eye slash outline`: "eye slash outline" = ("eye slash outline").asInstanceOf["eye slash outline"]
    
    inline def eyedropper: "eyedropper" = "eyedropper".asInstanceOf["eyedropper"]
    
    inline def facebook: "facebook" = "facebook".asInstanceOf["facebook"]
    
    inline def `facebook f`: "facebook f" = ("facebook f").asInstanceOf["facebook f"]
    
    inline def `facebook messenger`: "facebook messenger" = ("facebook messenger").asInstanceOf["facebook messenger"]
    
    inline def `facebook official`: "facebook official" = ("facebook official").asInstanceOf["facebook official"]
    
    inline def `facebook square`: "facebook square" = ("facebook square").asInstanceOf["facebook square"]
    
    inline def factory: "factory" = "factory".asInstanceOf["factory"]
    
    inline def `fast backward`: "fast backward" = ("fast backward").asInstanceOf["fast backward"]
    
    inline def `fast forward`: "fast forward" = ("fast forward").asInstanceOf["fast forward"]
    
    inline def favorite: "favorite" = "favorite".asInstanceOf["favorite"]
    
    inline def fax: "fax" = "fax".asInstanceOf["fax"]
    
    inline def feed: "feed" = "feed".asInstanceOf["feed"]
    
    inline def female: "female" = "female".asInstanceOf["female"]
    
    inline def `female homosexual`: "female homosexual" = ("female homosexual").asInstanceOf["female homosexual"]
    
    inline def `fighter jet`: "fighter jet" = ("fighter jet").asInstanceOf["fighter jet"]
    
    inline def file: "file" = "file".asInstanceOf["file"]
    
    inline def `file alternate`: "file alternate" = ("file alternate").asInstanceOf["file alternate"]
    
    inline def `file alternate outline`: "file alternate outline" = ("file alternate outline").asInstanceOf["file alternate outline"]
    
    inline def `file archive`: "file archive" = ("file archive").asInstanceOf["file archive"]
    
    inline def `file archive outline`: "file archive outline" = ("file archive outline").asInstanceOf["file archive outline"]
    
    inline def `file audio`: "file audio" = ("file audio").asInstanceOf["file audio"]
    
    inline def `file audio outline`: "file audio outline" = ("file audio outline").asInstanceOf["file audio outline"]
    
    inline def `file code`: "file code" = ("file code").asInstanceOf["file code"]
    
    inline def `file code outline`: "file code outline" = ("file code outline").asInstanceOf["file code outline"]
    
    inline def `file excel`: "file excel" = ("file excel").asInstanceOf["file excel"]
    
    inline def `file excel outline`: "file excel outline" = ("file excel outline").asInstanceOf["file excel outline"]
    
    inline def `file image`: "file image" = ("file image").asInstanceOf["file image"]
    
    inline def `file image outline`: "file image outline" = ("file image outline").asInstanceOf["file image outline"]
    
    inline def `file outline`: "file outline" = ("file outline").asInstanceOf["file outline"]
    
    inline def `file pdf`: "file pdf" = ("file pdf").asInstanceOf["file pdf"]
    
    inline def `file pdf outline`: "file pdf outline" = ("file pdf outline").asInstanceOf["file pdf outline"]
    
    inline def `file powerpoint`: "file powerpoint" = ("file powerpoint").asInstanceOf["file powerpoint"]
    
    inline def `file powerpoint outline`: "file powerpoint outline" = ("file powerpoint outline").asInstanceOf["file powerpoint outline"]
    
    inline def `file text`: "file text" = ("file text").asInstanceOf["file text"]
    
    inline def `file text outline`: "file text outline" = ("file text outline").asInstanceOf["file text outline"]
    
    inline def `file video`: "file video" = ("file video").asInstanceOf["file video"]
    
    inline def `file video outline`: "file video outline" = ("file video outline").asInstanceOf["file video outline"]
    
    inline def `file word`: "file word" = ("file word").asInstanceOf["file word"]
    
    inline def `file word outline`: "file word outline" = ("file word outline").asInstanceOf["file word outline"]
    
    inline def film: "film" = "film".asInstanceOf["film"]
    
    inline def filter: "filter" = "filter".asInstanceOf["filter"]
    
    inline def find: "find" = "find".asInstanceOf["find"]
    
    inline def fire: "fire" = "fire".asInstanceOf["fire"]
    
    inline def `fire extinguisher`: "fire extinguisher" = ("fire extinguisher").asInstanceOf["fire extinguisher"]
    
    inline def firefox: "firefox" = "firefox".asInstanceOf["firefox"]
    
    inline def `first aid`: "first aid" = ("first aid").asInstanceOf["first aid"]
    
    inline def `first order`: "first order" = ("first order").asInstanceOf["first order"]
    
    inline def firstdraft: "firstdraft" = "firstdraft".asInstanceOf["firstdraft"]
    
    inline def flag: "flag" = "flag".asInstanceOf["flag"]
    
    inline def `flag checkered`: "flag checkered" = ("flag checkered").asInstanceOf["flag checkered"]
    
    inline def `flag outline`: "flag outline" = ("flag outline").asInstanceOf["flag outline"]
    
    inline def flask: "flask" = "flask".asInstanceOf["flask"]
    
    inline def flickr: "flickr" = "flickr".asInstanceOf["flickr"]
    
    inline def flipboard: "flipboard" = "flipboard".asInstanceOf["flipboard"]
    
    inline def fly: "fly" = "fly".asInstanceOf["fly"]
    
    inline def folder: "folder" = "folder".asInstanceOf["folder"]
    
    inline def `folder open`: "folder open" = ("folder open").asInstanceOf["folder open"]
    
    inline def `folder open outline`: "folder open outline" = ("folder open outline").asInstanceOf["folder open outline"]
    
    inline def `folder outline`: "folder outline" = ("folder outline").asInstanceOf["folder outline"]
    
    inline def font: "font" = "font".asInstanceOf["font"]
    
    inline def `font awesome`: "font awesome" = ("font awesome").asInstanceOf["font awesome"]
    
    inline def `font awesome alternate`: "font awesome alternate" = ("font awesome alternate").asInstanceOf["font awesome alternate"]
    
    inline def `font awesome flag`: "font awesome flag" = ("font awesome flag").asInstanceOf["font awesome flag"]
    
    inline def fonticons: "fonticons" = "fonticons".asInstanceOf["fonticons"]
    
    inline def `fonticons fi`: "fonticons fi" = ("fonticons fi").asInstanceOf["fonticons fi"]
    
    inline def food: "food" = "food".asInstanceOf["food"]
    
    inline def `football ball`: "football ball" = ("football ball").asInstanceOf["football ball"]
    
    inline def fork: "fork" = "fork".asInstanceOf["fork"]
    
    inline def `fort awesome`: "fort awesome" = ("fort awesome").asInstanceOf["fort awesome"]
    
    inline def `fort awesome alternate`: "fort awesome alternate" = ("fort awesome alternate").asInstanceOf["fort awesome alternate"]
    
    inline def forumbee: "forumbee" = "forumbee".asInstanceOf["forumbee"]
    
    inline def forward: "forward" = "forward".asInstanceOf["forward"]
    
    inline def foursquare: "foursquare" = "foursquare".asInstanceOf["foursquare"]
    
    inline def `free code camp`: "free code camp" = ("free code camp").asInstanceOf["free code camp"]
    
    inline def freebsd: "freebsd" = "freebsd".asInstanceOf["freebsd"]
    
    inline def frown: "frown" = "frown".asInstanceOf["frown"]
    
    inline def `frown outline`: "frown outline" = ("frown outline").asInstanceOf["frown outline"]
    
    inline def futbol: "futbol" = "futbol".asInstanceOf["futbol"]
    
    inline def `futbol outline`: "futbol outline" = ("futbol outline").asInstanceOf["futbol outline"]
    
    inline def game: "game" = "game".asInstanceOf["game"]
    
    inline def gamepad: "gamepad" = "gamepad".asInstanceOf["gamepad"]
    
    inline def gavel: "gavel" = "gavel".asInstanceOf["gavel"]
    
    inline def gay: "gay" = "gay".asInstanceOf["gay"]
    
    inline def gbp: "gbp" = "gbp".asInstanceOf["gbp"]
    
    inline def gem: "gem" = "gem".asInstanceOf["gem"]
    
    inline def `gem outline`: "gem outline" = ("gem outline").asInstanceOf["gem outline"]
    
    inline def genderless: "genderless" = "genderless".asInstanceOf["genderless"]
    
    inline def `get pocket`: "get pocket" = ("get pocket").asInstanceOf["get pocket"]
    
    inline def gg: "gg" = "gg".asInstanceOf["gg"]
    
    inline def `gg circle`: "gg circle" = ("gg circle").asInstanceOf["gg circle"]
    
    inline def gift: "gift" = "gift".asInstanceOf["gift"]
    
    inline def git: "git" = "git".asInstanceOf["git"]
    
    inline def `git square`: "git square" = ("git square").asInstanceOf["git square"]
    
    inline def github: "github" = "github".asInstanceOf["github"]
    
    inline def `github alternate`: "github alternate" = ("github alternate").asInstanceOf["github alternate"]
    
    inline def `github square`: "github square" = ("github square").asInstanceOf["github square"]
    
    inline def gitkraken: "gitkraken" = "gitkraken".asInstanceOf["gitkraken"]
    
    inline def gitlab: "gitlab" = "gitlab".asInstanceOf["gitlab"]
    
    inline def gitter: "gitter" = "gitter".asInstanceOf["gitter"]
    
    inline def `glass martini`: "glass martini" = ("glass martini").asInstanceOf["glass martini"]
    
    inline def glide: "glide" = "glide".asInstanceOf["glide"]
    
    inline def `glide g`: "glide g" = ("glide g").asInstanceOf["glide g"]
    
    inline def globe: "globe" = "globe".asInstanceOf["globe"]
    
    inline def gofore: "gofore" = "gofore".asInstanceOf["gofore"]
    
    inline def `golf ball`: "golf ball" = ("golf ball").asInstanceOf["golf ball"]
    
    inline def goodreads: "goodreads" = "goodreads".asInstanceOf["goodreads"]
    
    inline def `goodreads g`: "goodreads g" = ("goodreads g").asInstanceOf["goodreads g"]
    
    inline def google: "google" = "google".asInstanceOf["google"]
    
    inline def `google drive`: "google drive" = ("google drive").asInstanceOf["google drive"]
    
    inline def `google play`: "google play" = ("google play").asInstanceOf["google play"]
    
    inline def `google plus`: "google plus" = ("google plus").asInstanceOf["google plus"]
    
    inline def `google plus circle`: "google plus circle" = ("google plus circle").asInstanceOf["google plus circle"]
    
    inline def `google plus g`: "google plus g" = ("google plus g").asInstanceOf["google plus g"]
    
    inline def `google plus official`: "google plus official" = ("google plus official").asInstanceOf["google plus official"]
    
    inline def `google plus square`: "google plus square" = ("google plus square").asInstanceOf["google plus square"]
    
    inline def `google wallet`: "google wallet" = ("google wallet").asInstanceOf["google wallet"]
    
    inline def grab: "grab" = "grab".asInstanceOf["grab"]
    
    inline def graduation: "graduation" = "graduation".asInstanceOf["graduation"]
    
    inline def `graduation cap`: "graduation cap" = ("graduation cap").asInstanceOf["graduation cap"]
    
    inline def gratipay: "gratipay" = "gratipay".asInstanceOf["gratipay"]
    
    inline def grav: "grav" = "grav".asInstanceOf["grav"]
    
    inline def `grid layout`: "grid layout" = ("grid layout").asInstanceOf["grid layout"]
    
    inline def gripfire: "gripfire" = "gripfire".asInstanceOf["gripfire"]
    
    inline def group: "group" = "group".asInstanceOf["group"]
    
    inline def grunt: "grunt" = "grunt".asInstanceOf["grunt"]
    
    inline def gulp: "gulp" = "gulp".asInstanceOf["gulp"]
    
    inline def h: "h" = "h".asInstanceOf["h"]
    
    inline def `h square`: "h square" = ("h square").asInstanceOf["h square"]
    
    inline def `hacker news`: "hacker news" = ("hacker news").asInstanceOf["hacker news"]
    
    inline def `hacker news square`: "hacker news square" = ("hacker news square").asInstanceOf["hacker news square"]
    
    inline def `hand lizard`: "hand lizard" = ("hand lizard").asInstanceOf["hand lizard"]
    
    inline def `hand lizard outline`: "hand lizard outline" = ("hand lizard outline").asInstanceOf["hand lizard outline"]
    
    inline def `hand paper`: "hand paper" = ("hand paper").asInstanceOf["hand paper"]
    
    inline def `hand paper outline`: "hand paper outline" = ("hand paper outline").asInstanceOf["hand paper outline"]
    
    inline def `hand peace`: "hand peace" = ("hand peace").asInstanceOf["hand peace"]
    
    inline def `hand peace outline`: "hand peace outline" = ("hand peace outline").asInstanceOf["hand peace outline"]
    
    inline def `hand point down`: "hand point down" = ("hand point down").asInstanceOf["hand point down"]
    
    inline def `hand point down outline`: "hand point down outline" = ("hand point down outline").asInstanceOf["hand point down outline"]
    
    inline def `hand point left`: "hand point left" = ("hand point left").asInstanceOf["hand point left"]
    
    inline def `hand point left outline`: "hand point left outline" = ("hand point left outline").asInstanceOf["hand point left outline"]
    
    inline def `hand point right`: "hand point right" = ("hand point right").asInstanceOf["hand point right"]
    
    inline def `hand point right outline`: "hand point right outline" = ("hand point right outline").asInstanceOf["hand point right outline"]
    
    inline def `hand point up`: "hand point up" = ("hand point up").asInstanceOf["hand point up"]
    
    inline def `hand point up outline`: "hand point up outline" = ("hand point up outline").asInstanceOf["hand point up outline"]
    
    inline def `hand pointer`: "hand pointer" = ("hand pointer").asInstanceOf["hand pointer"]
    
    inline def `hand pointer outline`: "hand pointer outline" = ("hand pointer outline").asInstanceOf["hand pointer outline"]
    
    inline def `hand rock`: "hand rock" = ("hand rock").asInstanceOf["hand rock"]
    
    inline def `hand rock outline`: "hand rock outline" = ("hand rock outline").asInstanceOf["hand rock outline"]
    
    inline def `hand scissors`: "hand scissors" = ("hand scissors").asInstanceOf["hand scissors"]
    
    inline def `hand scissors outline`: "hand scissors outline" = ("hand scissors outline").asInstanceOf["hand scissors outline"]
    
    inline def `hand spock`: "hand spock" = ("hand spock").asInstanceOf["hand spock"]
    
    inline def `hand spock outline`: "hand spock outline" = ("hand spock outline").asInstanceOf["hand spock outline"]
    
    inline def `hand victory`: "hand victory" = ("hand victory").asInstanceOf["hand victory"]
    
    inline def handicap: "handicap" = "handicap".asInstanceOf["handicap"]
    
    inline def handshake: "handshake" = "handshake".asInstanceOf["handshake"]
    
    inline def `handshake outline`: "handshake outline" = ("handshake outline").asInstanceOf["handshake outline"]
    
    inline def `hard of hearing`: "hard of hearing" = ("hard of hearing").asInstanceOf["hard of hearing"]
    
    inline def hashtag: "hashtag" = "hashtag".asInstanceOf["hashtag"]
    
    inline def hdd: "hdd" = "hdd".asInstanceOf["hdd"]
    
    inline def `hdd outline`: "hdd outline" = ("hdd outline").asInstanceOf["hdd outline"]
    
    inline def header: "header" = "header".asInstanceOf["header"]
    
    inline def heading: "heading" = "heading".asInstanceOf["heading"]
    
    inline def headphones: "headphones" = "headphones".asInstanceOf["headphones"]
    
    inline def heart: "heart" = "heart".asInstanceOf["heart"]
    
    inline def `heart outline`: "heart outline" = ("heart outline").asInstanceOf["heart outline"]
    
    inline def heartbeat: "heartbeat" = "heartbeat".asInstanceOf["heartbeat"]
    
    inline def help: "help" = "help".asInstanceOf["help"]
    
    inline def `help circle`: "help circle" = ("help circle").asInstanceOf["help circle"]
    
    inline def heterosexual: "heterosexual" = "heterosexual".asInstanceOf["heterosexual"]
    
    inline def hide: "hide" = "hide".asInstanceOf["hide"]
    
    inline def hips: "hips" = "hips".asInstanceOf["hips"]
    
    inline def `hire a helper`: "hire a helper" = ("hire a helper").asInstanceOf["hire a helper"]
    
    inline def history: "history" = "history".asInstanceOf["history"]
    
    inline def `hockey puck`: "hockey puck" = ("hockey puck").asInstanceOf["hockey puck"]
    
    inline def home: "home" = "home".asInstanceOf["home"]
    
    inline def hooli: "hooli" = "hooli".asInstanceOf["hooli"]
    
    inline def hospital: "hospital" = "hospital".asInstanceOf["hospital"]
    
    inline def `hospital outline`: "hospital outline" = ("hospital outline").asInstanceOf["hospital outline"]
    
    inline def `hospital symbol`: "hospital symbol" = ("hospital symbol").asInstanceOf["hospital symbol"]
    
    inline def hotel: "hotel" = "hotel".asInstanceOf["hotel"]
    
    inline def hotjar: "hotjar" = "hotjar".asInstanceOf["hotjar"]
    
    inline def hourglass: "hourglass" = "hourglass".asInstanceOf["hourglass"]
    
    inline def `hourglass end`: "hourglass end" = ("hourglass end").asInstanceOf["hourglass end"]
    
    inline def `hourglass four`: "hourglass four" = ("hourglass four").asInstanceOf["hourglass four"]
    
    inline def `hourglass full`: "hourglass full" = ("hourglass full").asInstanceOf["hourglass full"]
    
    inline def `hourglass half`: "hourglass half" = ("hourglass half").asInstanceOf["hourglass half"]
    
    inline def `hourglass one`: "hourglass one" = ("hourglass one").asInstanceOf["hourglass one"]
    
    inline def `hourglass outline`: "hourglass outline" = ("hourglass outline").asInstanceOf["hourglass outline"]
    
    inline def `hourglass start`: "hourglass start" = ("hourglass start").asInstanceOf["hourglass start"]
    
    inline def `hourglass three`: "hourglass three" = ("hourglass three").asInstanceOf["hourglass three"]
    
    inline def `hourglass two`: "hourglass two" = ("hourglass two").asInstanceOf["hourglass two"]
    
    inline def `hourglass zero`: "hourglass zero" = ("hourglass zero").asInstanceOf["hourglass zero"]
    
    inline def houzz: "houzz" = "houzz".asInstanceOf["houzz"]
    
    inline def html5: "html5" = "html5".asInstanceOf["html5"]
    
    inline def hubspot: "hubspot" = "hubspot".asInstanceOf["hubspot"]
    
    inline def `i cursor`: "i cursor" = ("i cursor").asInstanceOf["i cursor"]
    
    inline def `id badge`: "id badge" = ("id badge").asInstanceOf["id badge"]
    
    inline def `id badge outline`: "id badge outline" = ("id badge outline").asInstanceOf["id badge outline"]
    
    inline def `id card`: "id card" = ("id card").asInstanceOf["id card"]
    
    inline def `id card outline`: "id card outline" = ("id card outline").asInstanceOf["id card outline"]
    
    inline def idea: "idea" = "idea".asInstanceOf["idea"]
    
    inline def ils: "ils" = "ils".asInstanceOf["ils"]
    
    inline def image: "image" = "image".asInstanceOf["image"]
    
    inline def `image outline`: "image outline" = ("image outline").asInstanceOf["image outline"]
    
    inline def images: "images" = "images".asInstanceOf["images"]
    
    inline def `images outline`: "images outline" = ("images outline").asInstanceOf["images outline"]
    
    inline def imdb: "imdb" = "imdb".asInstanceOf["imdb"]
    
    inline def `in cart`: "in cart" = ("in cart").asInstanceOf["in cart"]
    
    inline def inbox: "inbox" = "inbox".asInstanceOf["inbox"]
    
    inline def indent: "indent" = "indent".asInstanceOf["indent"]
    
    inline def industry: "industry" = "industry".asInstanceOf["industry"]
    
    inline def info: "info" = "info".asInstanceOf["info"]
    
    inline def `info circle`: "info circle" = ("info circle").asInstanceOf["info circle"]
    
    inline def inr: "inr" = "inr".asInstanceOf["inr"]
    
    inline def instagram: "instagram" = "instagram".asInstanceOf["instagram"]
    
    inline def intergender: "intergender" = "intergender".asInstanceOf["intergender"]
    
    inline def `internet explorer`: "internet explorer" = ("internet explorer").asInstanceOf["internet explorer"]
    
    inline def intersex: "intersex" = "intersex".asInstanceOf["intersex"]
    
    inline def ioxhost: "ioxhost" = "ioxhost".asInstanceOf["ioxhost"]
    
    inline def italic: "italic" = "italic".asInstanceOf["italic"]
    
    inline def itunes: "itunes" = "itunes".asInstanceOf["itunes"]
    
    inline def `itunes note`: "itunes note" = ("itunes note").asInstanceOf["itunes note"]
    
    inline def jenkins: "jenkins" = "jenkins".asInstanceOf["jenkins"]
    
    inline def joget: "joget" = "joget".asInstanceOf["joget"]
    
    inline def joomla: "joomla" = "joomla".asInstanceOf["joomla"]
    
    inline def jpy: "jpy" = "jpy".asInstanceOf["jpy"]
    
    inline def `js square`: "js square" = ("js square").asInstanceOf["js square"]
    
    inline def js_ : "js" = "js".asInstanceOf["js"]
    
    inline def jsfiddle: "jsfiddle" = "jsfiddle".asInstanceOf["jsfiddle"]
    
    inline def key: "key" = "key".asInstanceOf["key"]
    
    inline def keyboard: "keyboard" = "keyboard".asInstanceOf["keyboard"]
    
    inline def `keyboard outline`: "keyboard outline" = ("keyboard outline").asInstanceOf["keyboard outline"]
    
    inline def keycdn: "keycdn" = "keycdn".asInstanceOf["keycdn"]
    
    inline def kickstarter: "kickstarter" = "kickstarter".asInstanceOf["kickstarter"]
    
    inline def `kickstarter k`: "kickstarter k" = ("kickstarter k").asInstanceOf["kickstarter k"]
    
    inline def korvue: "korvue" = "korvue".asInstanceOf["korvue"]
    
    inline def krw: "krw" = "krw".asInstanceOf["krw"]
    
    inline def lab: "lab" = "lab".asInstanceOf["lab"]
    
    inline def language: "language" = "language".asInstanceOf["language"]
    
    inline def laptop: "laptop" = "laptop".asInstanceOf["laptop"]
    
    inline def laravel: "laravel" = "laravel".asInstanceOf["laravel"]
    
    inline def lastfm: "lastfm" = "lastfm".asInstanceOf["lastfm"]
    
    inline def `lastfm square`: "lastfm square" = ("lastfm square").asInstanceOf["lastfm square"]
    
    inline def law: "law" = "law".asInstanceOf["law"]
    
    inline def leaf: "leaf" = "leaf".asInstanceOf["leaf"]
    
    inline def leanpub: "leanpub" = "leanpub".asInstanceOf["leanpub"]
    
    inline def legal: "legal" = "legal".asInstanceOf["legal"]
    
    inline def lemon: "lemon" = "lemon".asInstanceOf["lemon"]
    
    inline def `lemon outline`: "lemon outline" = ("lemon outline").asInstanceOf["lemon outline"]
    
    inline def lesbian: "lesbian" = "lesbian".asInstanceOf["lesbian"]
    
    inline def less: "less" = "less".asInstanceOf["less"]
    
    inline def `level down`: "level down" = ("level down").asInstanceOf["level down"]
    
    inline def `level down alternate`: "level down alternate" = ("level down alternate").asInstanceOf["level down alternate"]
    
    inline def `level up`: "level up" = ("level up").asInstanceOf["level up"]
    
    inline def `level up alternate`: "level up alternate" = ("level up alternate").asInstanceOf["level up alternate"]
    
    inline def `life ring`: "life ring" = ("life ring").asInstanceOf["life ring"]
    
    inline def `life ring outline`: "life ring outline" = ("life ring outline").asInstanceOf["life ring outline"]
    
    inline def lightbulb: "lightbulb" = "lightbulb".asInstanceOf["lightbulb"]
    
    inline def `lightbulb outline`: "lightbulb outline" = ("lightbulb outline").asInstanceOf["lightbulb outline"]
    
    inline def lightning: "lightning" = "lightning".asInstanceOf["lightning"]
    
    inline def like: "like" = "like".asInstanceOf["like"]
    
    inline def `line graph`: "line graph" = ("line graph").asInstanceOf["line graph"]
    
    inline def linechat: "linechat" = "linechat".asInstanceOf["linechat"]
    
    inline def linkedin: "linkedin" = "linkedin".asInstanceOf["linkedin"]
    
    inline def `linkedin alternate`: "linkedin alternate" = ("linkedin alternate").asInstanceOf["linkedin alternate"]
    
    inline def `linkedin square`: "linkedin square" = ("linkedin square").asInstanceOf["linkedin square"]
    
    inline def linkify: "linkify" = "linkify".asInstanceOf["linkify"]
    
    inline def linode: "linode" = "linode".asInstanceOf["linode"]
    
    inline def linux: "linux" = "linux".asInstanceOf["linux"]
    
    inline def lira: "lira" = "lira".asInstanceOf["lira"]
    
    inline def `lira sign`: "lira sign" = ("lira sign").asInstanceOf["lira sign"]
    
    inline def list: "list" = "list".asInstanceOf["list"]
    
    inline def `list alternate`: "list alternate" = ("list alternate").asInstanceOf["list alternate"]
    
    inline def `list alternate outline`: "list alternate outline" = ("list alternate outline").asInstanceOf["list alternate outline"]
    
    inline def `list layout`: "list layout" = ("list layout").asInstanceOf["list layout"]
    
    inline def `list ol`: "list ol" = ("list ol").asInstanceOf["list ol"]
    
    inline def `list ul`: "list ul" = ("list ul").asInstanceOf["list ul"]
    
    inline def `location arrow`: "location arrow" = ("location arrow").asInstanceOf["location arrow"]
    
    inline def lock: "lock" = "lock".asInstanceOf["lock"]
    
    inline def `lock open`: "lock open" = ("lock open").asInstanceOf["lock open"]
    
    inline def `log out`: "log out" = ("log out").asInstanceOf["log out"]
    
    inline def `long arrow alternate down`: "long arrow alternate down" = ("long arrow alternate down").asInstanceOf["long arrow alternate down"]
    
    inline def `long arrow alternate left`: "long arrow alternate left" = ("long arrow alternate left").asInstanceOf["long arrow alternate left"]
    
    inline def `long arrow alternate right`: "long arrow alternate right" = ("long arrow alternate right").asInstanceOf["long arrow alternate right"]
    
    inline def `long arrow alternate up`: "long arrow alternate up" = ("long arrow alternate up").asInstanceOf["long arrow alternate up"]
    
    inline def `low vision`: "low vision" = ("low vision").asInstanceOf["low vision"]
    
    inline def lyft: "lyft" = "lyft".asInstanceOf["lyft"]
    
    inline def magento: "magento" = "magento".asInstanceOf["magento"]
    
    inline def magic: "magic" = "magic".asInstanceOf["magic"]
    
    inline def magnet: "magnet" = "magnet".asInstanceOf["magnet"]
    
    inline def magnify: "magnify" = "magnify".asInstanceOf["magnify"]
    
    inline def mail: "mail" = "mail".asInstanceOf["mail"]
    
    inline def `mail forward`: "mail forward" = ("mail forward").asInstanceOf["mail forward"]
    
    inline def `mail outline`: "mail outline" = ("mail outline").asInstanceOf["mail outline"]
    
    inline def `mail square`: "mail square" = ("mail square").asInstanceOf["mail square"]
    
    inline def male: "male" = "male".asInstanceOf["male"]
    
    inline def `male homosexual`: "male homosexual" = ("male homosexual").asInstanceOf["male homosexual"]
    
    inline def man: "man" = "man".asInstanceOf["man"]
    
    inline def map: "map" = "map".asInstanceOf["map"]
    
    inline def `map marker`: "map marker" = ("map marker").asInstanceOf["map marker"]
    
    inline def `map marker alternate`: "map marker alternate" = ("map marker alternate").asInstanceOf["map marker alternate"]
    
    inline def `map outline`: "map outline" = ("map outline").asInstanceOf["map outline"]
    
    inline def `map pin`: "map pin" = ("map pin").asInstanceOf["map pin"]
    
    inline def `map signs`: "map signs" = ("map signs").asInstanceOf["map signs"]
    
    inline def marker: "marker" = "marker".asInstanceOf["marker"]
    
    inline def mars: "mars" = "mars".asInstanceOf["mars"]
    
    inline def `mars alternate`: "mars alternate" = ("mars alternate").asInstanceOf["mars alternate"]
    
    inline def `mars double`: "mars double" = ("mars double").asInstanceOf["mars double"]
    
    inline def `mars horizontal`: "mars horizontal" = ("mars horizontal").asInstanceOf["mars horizontal"]
    
    inline def `mars stroke`: "mars stroke" = ("mars stroke").asInstanceOf["mars stroke"]
    
    inline def `mars stroke horizontal`: "mars stroke horizontal" = ("mars stroke horizontal").asInstanceOf["mars stroke horizontal"]
    
    inline def `mars stroke vertical`: "mars stroke vertical" = ("mars stroke vertical").asInstanceOf["mars stroke vertical"]
    
    inline def `mars vertical`: "mars vertical" = ("mars vertical").asInstanceOf["mars vertical"]
    
    inline def maxcdn: "maxcdn" = "maxcdn".asInstanceOf["maxcdn"]
    
    inline def meanpath: "meanpath" = "meanpath".asInstanceOf["meanpath"]
    
    inline def medapps: "medapps" = "medapps".asInstanceOf["medapps"]
    
    inline def medium: "medium" = "medium".asInstanceOf["medium"]
    
    inline def `medium m`: "medium m" = ("medium m").asInstanceOf["medium m"]
    
    inline def medkit: "medkit" = "medkit".asInstanceOf["medkit"]
    
    inline def medrt: "medrt" = "medrt".asInstanceOf["medrt"]
    
    inline def meetup: "meetup" = "meetup".asInstanceOf["meetup"]
    
    inline def meh: "meh" = "meh".asInstanceOf["meh"]
    
    inline def `meh outline`: "meh outline" = ("meh outline").asInstanceOf["meh outline"]
    
    inline def mercury: "mercury" = "mercury".asInstanceOf["mercury"]
    
    inline def microchip: "microchip" = "microchip".asInstanceOf["microchip"]
    
    inline def microphone: "microphone" = "microphone".asInstanceOf["microphone"]
    
    inline def `microphone slash`: "microphone slash" = ("microphone slash").asInstanceOf["microphone slash"]
    
    inline def microsoft: "microsoft" = "microsoft".asInstanceOf["microsoft"]
    
    inline def `microsoft edge`: "microsoft edge" = ("microsoft edge").asInstanceOf["microsoft edge"]
    
    inline def military: "military" = "military".asInstanceOf["military"]
    
    inline def minus: "minus" = "minus".asInstanceOf["minus"]
    
    inline def `minus circle`: "minus circle" = ("minus circle").asInstanceOf["minus circle"]
    
    inline def `minus square`: "minus square" = ("minus square").asInstanceOf["minus square"]
    
    inline def `minus square outline`: "minus square outline" = ("minus square outline").asInstanceOf["minus square outline"]
    
    inline def mix: "mix" = "mix".asInstanceOf["mix"]
    
    inline def mixcloud: "mixcloud" = "mixcloud".asInstanceOf["mixcloud"]
    
    inline def mizuni: "mizuni" = "mizuni".asInstanceOf["mizuni"]
    
    inline def mobile: "mobile" = "mobile".asInstanceOf["mobile"]
    
    inline def `mobile alternate`: "mobile alternate" = ("mobile alternate").asInstanceOf["mobile alternate"]
    
    inline def modx: "modx" = "modx".asInstanceOf["modx"]
    
    inline def monero: "monero" = "monero".asInstanceOf["monero"]
    
    inline def money: "money" = "money".asInstanceOf["money"]
    
    inline def `money bill alternate`: "money bill alternate" = ("money bill alternate").asInstanceOf["money bill alternate"]
    
    inline def `money bill alternate outline`: "money bill alternate outline" = ("money bill alternate outline").asInstanceOf["money bill alternate outline"]
    
    inline def moon: "moon" = "moon".asInstanceOf["moon"]
    
    inline def `moon outline`: "moon outline" = ("moon outline").asInstanceOf["moon outline"]
    
    inline def motorcycle: "motorcycle" = "motorcycle".asInstanceOf["motorcycle"]
    
    inline def `mouse pointer`: "mouse pointer" = ("mouse pointer").asInstanceOf["mouse pointer"]
    
    inline def move: "move" = "move".asInstanceOf["move"]
    
    inline def `ms edge`: "ms edge" = ("ms edge").asInstanceOf["ms edge"]
    
    inline def music: "music" = "music".asInstanceOf["music"]
    
    inline def mute: "mute" = "mute".asInstanceOf["mute"]
    
    inline def napster: "napster" = "napster".asInstanceOf["napster"]
    
    inline def neuter: "neuter" = "neuter".asInstanceOf["neuter"]
    
    inline def `new pied piper`: "new pied piper" = ("new pied piper").asInstanceOf["new pied piper"]
    
    inline def newspaper: "newspaper" = "newspaper".asInstanceOf["newspaper"]
    
    inline def `newspaper outline`: "newspaper outline" = ("newspaper outline").asInstanceOf["newspaper outline"]
    
    inline def `nintendo switch`: "nintendo switch" = ("nintendo switch").asInstanceOf["nintendo switch"]
    
    inline def node: "node" = "node".asInstanceOf["node"]
    
    inline def `node js`: "node js" = ("node js").asInstanceOf["node js"]
    
    inline def `non binary transgender`: "non binary transgender" = ("non binary transgender").asInstanceOf["non binary transgender"]
    
    inline def npm: "npm" = "npm".asInstanceOf["npm"]
    
    inline def ns8: "ns8" = "ns8".asInstanceOf["ns8"]
    
    inline def `numbered list`: "numbered list" = ("numbered list").asInstanceOf["numbered list"]
    
    inline def nutritionix: "nutritionix" = "nutritionix".asInstanceOf["nutritionix"]
    
    inline def `object group`: "object group" = ("object group").asInstanceOf["object group"]
    
    inline def `object group outline`: "object group outline" = ("object group outline").asInstanceOf["object group outline"]
    
    inline def `object ungroup`: "object ungroup" = ("object ungroup").asInstanceOf["object ungroup"]
    
    inline def `object ungroup outline`: "object ungroup outline" = ("object ungroup outline").asInstanceOf["object ungroup outline"]
    
    inline def odnoklassniki: "odnoklassniki" = "odnoklassniki".asInstanceOf["odnoklassniki"]
    
    inline def `odnoklassniki square`: "odnoklassniki square" = ("odnoklassniki square").asInstanceOf["odnoklassniki square"]
    
    inline def opencart: "opencart" = "opencart".asInstanceOf["opencart"]
    
    inline def openid: "openid" = "openid".asInstanceOf["openid"]
    
    inline def opera: "opera" = "opera".asInstanceOf["opera"]
    
    inline def `optin monster`: "optin monster" = ("optin monster").asInstanceOf["optin monster"]
    
    inline def options: "options" = "options".asInstanceOf["options"]
    
    inline def `ordered list`: "ordered list" = ("ordered list").asInstanceOf["ordered list"]
    
    inline def osi: "osi" = "osi".asInstanceOf["osi"]
    
    inline def `other gender`: "other gender" = ("other gender").asInstanceOf["other gender"]
    
    inline def `other gender horizontal`: "other gender horizontal" = ("other gender horizontal").asInstanceOf["other gender horizontal"]
    
    inline def `other gender vertical`: "other gender vertical" = ("other gender vertical").asInstanceOf["other gender vertical"]
    
    inline def outdent: "outdent" = "outdent".asInstanceOf["outdent"]
    
    inline def page4: "page4" = "page4".asInstanceOf["page4"]
    
    inline def pagelines: "pagelines" = "pagelines".asInstanceOf["pagelines"]
    
    inline def `paint brush`: "paint brush" = ("paint brush").asInstanceOf["paint brush"]
    
    inline def palfed: "palfed" = "palfed".asInstanceOf["palfed"]
    
    inline def pallet: "pallet" = "pallet".asInstanceOf["pallet"]
    
    inline def `paper plane`: "paper plane" = ("paper plane").asInstanceOf["paper plane"]
    
    inline def `paper plane outline`: "paper plane outline" = ("paper plane outline").asInstanceOf["paper plane outline"]
    
    inline def paperclip: "paperclip" = "paperclip".asInstanceOf["paperclip"]
    
    inline def paragraph: "paragraph" = "paragraph".asInstanceOf["paragraph"]
    
    inline def paste: "paste" = "paste".asInstanceOf["paste"]
    
    inline def patreon: "patreon" = "patreon".asInstanceOf["patreon"]
    
    inline def pause: "pause" = "pause".asInstanceOf["pause"]
    
    inline def `pause circle`: "pause circle" = ("pause circle").asInstanceOf["pause circle"]
    
    inline def `pause circle outline`: "pause circle outline" = ("pause circle outline").asInstanceOf["pause circle outline"]
    
    inline def paw: "paw" = "paw".asInstanceOf["paw"]
    
    inline def payment: "payment" = "payment".asInstanceOf["payment"]
    
    inline def paypal: "paypal" = "paypal".asInstanceOf["paypal"]
    
    inline def `paypal card`: "paypal card" = ("paypal card").asInstanceOf["paypal card"]
    
    inline def `pen square`: "pen square" = ("pen square").asInstanceOf["pen square"]
    
    inline def pencil: "pencil" = "pencil".asInstanceOf["pencil"]
    
    inline def `pencil alternate`: "pencil alternate" = ("pencil alternate").asInstanceOf["pencil alternate"]
    
    inline def `pencil square`: "pencil square" = ("pencil square").asInstanceOf["pencil square"]
    
    inline def percent: "percent" = "percent".asInstanceOf["percent"]
    
    inline def periscope: "periscope" = "periscope".asInstanceOf["periscope"]
    
    inline def phabricator: "phabricator" = "phabricator".asInstanceOf["phabricator"]
    
    inline def `phoenix framework`: "phoenix framework" = ("phoenix framework").asInstanceOf["phoenix framework"]
    
    inline def phone: "phone" = "phone".asInstanceOf["phone"]
    
    inline def `phone square`: "phone square" = ("phone square").asInstanceOf["phone square"]
    
    inline def `phone volume`: "phone volume" = ("phone volume").asInstanceOf["phone volume"]
    
    inline def photo: "photo" = "photo".asInstanceOf["photo"]
    
    inline def php: "php" = "php".asInstanceOf["php"]
    
    inline def picture: "picture" = "picture".asInstanceOf["picture"]
    
    inline def `pie chart`: "pie chart" = ("pie chart").asInstanceOf["pie chart"]
    
    inline def `pie graph`: "pie graph" = ("pie graph").asInstanceOf["pie graph"]
    
    inline def `pied piper`: "pied piper" = ("pied piper").asInstanceOf["pied piper"]
    
    inline def `pied piper alternate`: "pied piper alternate" = ("pied piper alternate").asInstanceOf["pied piper alternate"]
    
    inline def `pied piper hat`: "pied piper hat" = ("pied piper hat").asInstanceOf["pied piper hat"]
    
    inline def `pied piper pp`: "pied piper pp" = ("pied piper pp").asInstanceOf["pied piper pp"]
    
    inline def pills: "pills" = "pills".asInstanceOf["pills"]
    
    inline def pin: "pin" = "pin".asInstanceOf["pin"]
    
    inline def pinterest: "pinterest" = "pinterest".asInstanceOf["pinterest"]
    
    inline def `pinterest p`: "pinterest p" = ("pinterest p").asInstanceOf["pinterest p"]
    
    inline def `pinterest square`: "pinterest square" = ("pinterest square").asInstanceOf["pinterest square"]
    
    inline def plane: "plane" = "plane".asInstanceOf["plane"]
    
    inline def play: "play" = "play".asInstanceOf["play"]
    
    inline def `play circle`: "play circle" = ("play circle").asInstanceOf["play circle"]
    
    inline def `play circle outline`: "play circle outline" = ("play circle outline").asInstanceOf["play circle outline"]
    
    inline def playstation: "playstation" = "playstation".asInstanceOf["playstation"]
    
    inline def plug: "plug" = "plug".asInstanceOf["plug"]
    
    inline def plus: "plus" = "plus".asInstanceOf["plus"]
    
    inline def `plus cart`: "plus cart" = ("plus cart").asInstanceOf["plus cart"]
    
    inline def `plus circle`: "plus circle" = ("plus circle").asInstanceOf["plus circle"]
    
    inline def `plus square`: "plus square" = ("plus square").asInstanceOf["plus square"]
    
    inline def `plus square outline`: "plus square outline" = ("plus square outline").asInstanceOf["plus square outline"]
    
    inline def podcast: "podcast" = "podcast".asInstanceOf["podcast"]
    
    inline def point: "point" = "point".asInstanceOf["point"]
    
    inline def `pointing down`: "pointing down" = ("pointing down").asInstanceOf["pointing down"]
    
    inline def `pointing left`: "pointing left" = ("pointing left").asInstanceOf["pointing left"]
    
    inline def `pointing right`: "pointing right" = ("pointing right").asInstanceOf["pointing right"]
    
    inline def `pointing up`: "pointing up" = ("pointing up").asInstanceOf["pointing up"]
    
    inline def pound: "pound" = "pound".asInstanceOf["pound"]
    
    inline def `pound sign`: "pound sign" = ("pound sign").asInstanceOf["pound sign"]
    
    inline def power: "power" = "power".asInstanceOf["power"]
    
    inline def `power cord`: "power cord" = ("power cord").asInstanceOf["power cord"]
    
    inline def `power off`: "power off" = ("power off").asInstanceOf["power off"]
    
    inline def print: "print" = "print".asInstanceOf["print"]
    
    inline def privacy: "privacy" = "privacy".asInstanceOf["privacy"]
    
    inline def `product hunt`: "product hunt" = ("product hunt").asInstanceOf["product hunt"]
    
    inline def protect: "protect" = "protect".asInstanceOf["protect"]
    
    inline def pushed: "pushed" = "pushed".asInstanceOf["pushed"]
    
    inline def puzzle: "puzzle" = "puzzle".asInstanceOf["puzzle"]
    
    inline def `puzzle piece`: "puzzle piece" = ("puzzle piece").asInstanceOf["puzzle piece"]
    
    inline def python: "python" = "python".asInstanceOf["python"]
    
    inline def qq: "qq" = "qq".asInstanceOf["qq"]
    
    inline def qrcode: "qrcode" = "qrcode".asInstanceOf["qrcode"]
    
    inline def question: "question" = "question".asInstanceOf["question"]
    
    inline def `question circle`: "question circle" = ("question circle").asInstanceOf["question circle"]
    
    inline def `question circle outline`: "question circle outline" = ("question circle outline").asInstanceOf["question circle outline"]
    
    inline def quidditch: "quidditch" = "quidditch".asInstanceOf["quidditch"]
    
    inline def quinscape: "quinscape" = "quinscape".asInstanceOf["quinscape"]
    
    inline def quora: "quora" = "quora".asInstanceOf["quora"]
    
    inline def `quote left`: "quote left" = ("quote left").asInstanceOf["quote left"]
    
    inline def `quote right`: "quote right" = ("quote right").asInstanceOf["quote right"]
    
    inline def `r circle`: "r circle" = ("r circle").asInstanceOf["r circle"]
    
    inline def radio: "radio" = "radio".asInstanceOf["radio"]
    
    inline def rain: "rain" = "rain".asInstanceOf["rain"]
    
    inline def random: "random" = "random".asInstanceOf["random"]
    
    inline def ravelry: "ravelry" = "ravelry".asInstanceOf["ravelry"]
    
    inline def react: "react" = "react".asInstanceOf["react"]
    
    inline def rebel: "rebel" = "rebel".asInstanceOf["rebel"]
    
    inline def record: "record" = "record".asInstanceOf["record"]
    
    inline def recycle: "recycle" = "recycle".asInstanceOf["recycle"]
    
    inline def reddit: "reddit" = "reddit".asInstanceOf["reddit"]
    
    inline def `reddit alien`: "reddit alien" = ("reddit alien").asInstanceOf["reddit alien"]
    
    inline def `reddit square`: "reddit square" = ("reddit square").asInstanceOf["reddit square"]
    
    inline def redo: "redo" = "redo".asInstanceOf["redo"]
    
    inline def `redo alternate`: "redo alternate" = ("redo alternate").asInstanceOf["redo alternate"]
    
    inline def redriver: "redriver" = "redriver".asInstanceOf["redriver"]
    
    inline def refresh: "refresh" = "refresh".asInstanceOf["refresh"]
    
    inline def registered: "registered" = "registered".asInstanceOf["registered"]
    
    inline def `registered outline`: "registered outline" = ("registered outline").asInstanceOf["registered outline"]
    
    inline def remove: "remove" = "remove".asInstanceOf["remove"]
    
    inline def `remove bookmark`: "remove bookmark" = ("remove bookmark").asInstanceOf["remove bookmark"]
    
    inline def `remove circle`: "remove circle" = ("remove circle").asInstanceOf["remove circle"]
    
    inline def `remove from calendar`: "remove from calendar" = ("remove from calendar").asInstanceOf["remove from calendar"]
    
    inline def `remove user`: "remove user" = ("remove user").asInstanceOf["remove user"]
    
    inline def rendact: "rendact" = "rendact".asInstanceOf["rendact"]
    
    inline def renren: "renren" = "renren".asInstanceOf["renren"]
    
    inline def repeat: "repeat" = "repeat".asInstanceOf["repeat"]
    
    inline def reply: "reply" = "reply".asInstanceOf["reply"]
    
    inline def `reply all`: "reply all" = ("reply all").asInstanceOf["reply all"]
    
    inline def replyd: "replyd" = "replyd".asInstanceOf["replyd"]
    
    inline def `resize horizontal`: "resize horizontal" = ("resize horizontal").asInstanceOf["resize horizontal"]
    
    inline def `resize vertical`: "resize vertical" = ("resize vertical").asInstanceOf["resize vertical"]
    
    inline def resolving: "resolving" = "resolving".asInstanceOf["resolving"]
    
    inline def retweet: "retweet" = "retweet".asInstanceOf["retweet"]
    
    inline def rmb: "rmb" = "rmb".asInstanceOf["rmb"]
    
    inline def road: "road" = "road".asInstanceOf["road"]
    
    inline def rocket: "rocket" = "rocket".asInstanceOf["rocket"]
    
    inline def rocketchat: "rocketchat" = "rocketchat".asInstanceOf["rocketchat"]
    
    inline def rockrms: "rockrms" = "rockrms".asInstanceOf["rockrms"]
    
    inline def rouble: "rouble" = "rouble".asInstanceOf["rouble"]
    
    inline def rss: "rss" = "rss".asInstanceOf["rss"]
    
    inline def `rss square`: "rss square" = ("rss square").asInstanceOf["rss square"]
    
    inline def rub: "rub" = "rub".asInstanceOf["rub"]
    
    inline def ruble: "ruble" = "ruble".asInstanceOf["ruble"]
    
    inline def `ruble sign`: "ruble sign" = ("ruble sign").asInstanceOf["ruble sign"]
    
    inline def rupee: "rupee" = "rupee".asInstanceOf["rupee"]
    
    inline def `rupee sign`: "rupee sign" = ("rupee sign").asInstanceOf["rupee sign"]
    
    inline def s15: "s15" = "s15".asInstanceOf["s15"]
    
    inline def safari: "safari" = "safari".asInstanceOf["safari"]
    
    inline def sass: "sass" = "sass".asInstanceOf["sass"]
    
    inline def save: "save" = "save".asInstanceOf["save"]
    
    inline def `save outline`: "save outline" = ("save outline").asInstanceOf["save outline"]
    
    inline def schlix: "schlix" = "schlix".asInstanceOf["schlix"]
    
    inline def scribd: "scribd" = "scribd".asInstanceOf["scribd"]
    
    inline def search: "search" = "search".asInstanceOf["search"]
    
    inline def `search minus`: "search minus" = ("search minus").asInstanceOf["search minus"]
    
    inline def `search plus`: "search plus" = ("search plus").asInstanceOf["search plus"]
    
    inline def searchengin: "searchengin" = "searchengin".asInstanceOf["searchengin"]
    
    inline def `selected radio`: "selected radio" = ("selected radio").asInstanceOf["selected radio"]
    
    inline def sellcast: "sellcast" = "sellcast".asInstanceOf["sellcast"]
    
    inline def sellsy: "sellsy" = "sellsy".asInstanceOf["sellsy"]
    
    inline def send: "send" = "send".asInstanceOf["send"]
    
    inline def server: "server" = "server".asInstanceOf["server"]
    
    inline def servicestack: "servicestack" = "servicestack".asInstanceOf["servicestack"]
    
    inline def setting: "setting" = "setting".asInstanceOf["setting"]
    
    inline def settings: "settings" = "settings".asInstanceOf["settings"]
    
    inline def share: "share" = "share".asInstanceOf["share"]
    
    inline def `share alternate`: "share alternate" = ("share alternate").asInstanceOf["share alternate"]
    
    inline def `share alternate square`: "share alternate square" = ("share alternate square").asInstanceOf["share alternate square"]
    
    inline def `share square`: "share square" = ("share square").asInstanceOf["share square"]
    
    inline def `share square outline`: "share square outline" = ("share square outline").asInstanceOf["share square outline"]
    
    inline def shekel: "shekel" = "shekel".asInstanceOf["shekel"]
    
    inline def `shekel sign`: "shekel sign" = ("shekel sign").asInstanceOf["shekel sign"]
    
    inline def sheqel: "sheqel" = "sheqel".asInstanceOf["sheqel"]
    
    inline def shield: "shield" = "shield".asInstanceOf["shield"]
    
    inline def `shield alternate`: "shield alternate" = ("shield alternate").asInstanceOf["shield alternate"]
    
    inline def ship: "ship" = "ship".asInstanceOf["ship"]
    
    inline def shipping: "shipping" = "shipping".asInstanceOf["shipping"]
    
    inline def `shipping fast`: "shipping fast" = ("shipping fast").asInstanceOf["shipping fast"]
    
    inline def shirtsinbulk: "shirtsinbulk" = "shirtsinbulk".asInstanceOf["shirtsinbulk"]
    
    inline def shop: "shop" = "shop".asInstanceOf["shop"]
    
    inline def `shopping bag`: "shopping bag" = ("shopping bag").asInstanceOf["shopping bag"]
    
    inline def `shopping basket`: "shopping basket" = ("shopping basket").asInstanceOf["shopping basket"]
    
    inline def `shopping cart`: "shopping cart" = ("shopping cart").asInstanceOf["shopping cart"]
    
    inline def shower: "shower" = "shower".asInstanceOf["shower"]
    
    inline def shuffle: "shuffle" = "shuffle".asInstanceOf["shuffle"]
    
    inline def shutdown: "shutdown" = "shutdown".asInstanceOf["shutdown"]
    
    inline def sidebar: "sidebar" = "sidebar".asInstanceOf["sidebar"]
    
    inline def `sign in`: "sign in" = ("sign in").asInstanceOf["sign in"]
    
    inline def `sign in alternate`: "sign in alternate" = ("sign in alternate").asInstanceOf["sign in alternate"]
    
    inline def `sign language`: "sign language" = ("sign language").asInstanceOf["sign language"]
    
    inline def `sign out`: "sign out" = ("sign out").asInstanceOf["sign out"]
    
    inline def `sign out alternate`: "sign out alternate" = ("sign out alternate").asInstanceOf["sign out alternate"]
    
    inline def `sign-in`: "sign-in" = "sign-in".asInstanceOf["sign-in"]
    
    inline def `sign-in alternate`: "sign-in alternate" = ("sign-in alternate").asInstanceOf["sign-in alternate"]
    
    inline def `sign-out`: "sign-out" = "sign-out".asInstanceOf["sign-out"]
    
    inline def `sign-out alternate`: "sign-out alternate" = ("sign-out alternate").asInstanceOf["sign-out alternate"]
    
    inline def signal: "signal" = "signal".asInstanceOf["signal"]
    
    inline def signing: "signing" = "signing".asInstanceOf["signing"]
    
    inline def signup: "signup" = "signup".asInstanceOf["signup"]
    
    inline def simplybuilt: "simplybuilt" = "simplybuilt".asInstanceOf["simplybuilt"]
    
    inline def sistrix: "sistrix" = "sistrix".asInstanceOf["sistrix"]
    
    inline def sitemap: "sitemap" = "sitemap".asInstanceOf["sitemap"]
    
    inline def skyatlas: "skyatlas" = "skyatlas".asInstanceOf["skyatlas"]
    
    inline def skype: "skype" = "skype".asInstanceOf["skype"]
    
    inline def slack: "slack" = "slack".asInstanceOf["slack"]
    
    inline def `slack hash`: "slack hash" = ("slack hash").asInstanceOf["slack hash"]
    
    inline def sliders: "sliders" = "sliders".asInstanceOf["sliders"]
    
    inline def `sliders horizontal`: "sliders horizontal" = ("sliders horizontal").asInstanceOf["sliders horizontal"]
    
    inline def slideshare: "slideshare" = "slideshare".asInstanceOf["slideshare"]
    
    inline def smile: "smile" = "smile".asInstanceOf["smile"]
    
    inline def `smile outline`: "smile outline" = ("smile outline").asInstanceOf["smile outline"]
    
    inline def snapchat: "snapchat" = "snapchat".asInstanceOf["snapchat"]
    
    inline def `snapchat ghost`: "snapchat ghost" = ("snapchat ghost").asInstanceOf["snapchat ghost"]
    
    inline def `snapchat square`: "snapchat square" = ("snapchat square").asInstanceOf["snapchat square"]
    
    inline def snowflake: "snowflake" = "snowflake".asInstanceOf["snowflake"]
    
    inline def `snowflake outline`: "snowflake outline" = ("snowflake outline").asInstanceOf["snowflake outline"]
    
    inline def soccer: "soccer" = "soccer".asInstanceOf["soccer"]
    
    inline def sort: "sort" = "sort".asInstanceOf["sort"]
    
    inline def `sort alphabet ascending`: "sort alphabet ascending" = ("sort alphabet ascending").asInstanceOf["sort alphabet ascending"]
    
    inline def `sort alphabet descending`: "sort alphabet descending" = ("sort alphabet descending").asInstanceOf["sort alphabet descending"]
    
    inline def `sort alphabet down`: "sort alphabet down" = ("sort alphabet down").asInstanceOf["sort alphabet down"]
    
    inline def `sort alphabet up`: "sort alphabet up" = ("sort alphabet up").asInstanceOf["sort alphabet up"]
    
    inline def `sort amount down`: "sort amount down" = ("sort amount down").asInstanceOf["sort amount down"]
    
    inline def `sort amount up`: "sort amount up" = ("sort amount up").asInstanceOf["sort amount up"]
    
    inline def `sort ascending`: "sort ascending" = ("sort ascending").asInstanceOf["sort ascending"]
    
    inline def `sort content ascending`: "sort content ascending" = ("sort content ascending").asInstanceOf["sort content ascending"]
    
    inline def `sort content descending`: "sort content descending" = ("sort content descending").asInstanceOf["sort content descending"]
    
    inline def `sort descending`: "sort descending" = ("sort descending").asInstanceOf["sort descending"]
    
    inline def `sort down`: "sort down" = ("sort down").asInstanceOf["sort down"]
    
    inline def `sort numeric ascending`: "sort numeric ascending" = ("sort numeric ascending").asInstanceOf["sort numeric ascending"]
    
    inline def `sort numeric descending`: "sort numeric descending" = ("sort numeric descending").asInstanceOf["sort numeric descending"]
    
    inline def `sort numeric down`: "sort numeric down" = ("sort numeric down").asInstanceOf["sort numeric down"]
    
    inline def `sort numeric up`: "sort numeric up" = ("sort numeric up").asInstanceOf["sort numeric up"]
    
    inline def `sort up`: "sort up" = ("sort up").asInstanceOf["sort up"]
    
    inline def sound: "sound" = "sound".asInstanceOf["sound"]
    
    inline def soundcloud: "soundcloud" = "soundcloud".asInstanceOf["soundcloud"]
    
    inline def `space shuttle`: "space shuttle" = ("space shuttle").asInstanceOf["space shuttle"]
    
    inline def speakap: "speakap" = "speakap".asInstanceOf["speakap"]
    
    inline def spinner: "spinner" = "spinner".asInstanceOf["spinner"]
    
    inline def spoon: "spoon" = "spoon".asInstanceOf["spoon"]
    
    inline def spotify: "spotify" = "spotify".asInstanceOf["spotify"]
    
    inline def spy: "spy" = "spy".asInstanceOf["spy"]
    
    inline def square: "square" = "square".asInstanceOf["square"]
    
    inline def `square full`: "square full" = ("square full").asInstanceOf["square full"]
    
    inline def `square outline`: "square outline" = ("square outline").asInstanceOf["square outline"]
    
    inline def `stack exchange`: "stack exchange" = ("stack exchange").asInstanceOf["stack exchange"]
    
    inline def `stack overflow`: "stack overflow" = ("stack overflow").asInstanceOf["stack overflow"]
    
    inline def star: "star" = "star".asInstanceOf["star"]
    
    inline def `star half`: "star half" = ("star half").asInstanceOf["star half"]
    
    inline def `star half empty`: "star half empty" = ("star half empty").asInstanceOf["star half empty"]
    
    inline def `star half full`: "star half full" = ("star half full").asInstanceOf["star half full"]
    
    inline def `star half outline`: "star half outline" = ("star half outline").asInstanceOf["star half outline"]
    
    inline def `star outline`: "star outline" = ("star outline").asInstanceOf["star outline"]
    
    inline def staylinked: "staylinked" = "staylinked".asInstanceOf["staylinked"]
    
    inline def steam: "steam" = "steam".asInstanceOf["steam"]
    
    inline def `steam square`: "steam square" = ("steam square").asInstanceOf["steam square"]
    
    inline def `steam symbol`: "steam symbol" = ("steam symbol").asInstanceOf["steam symbol"]
    
    inline def `step backward`: "step backward" = ("step backward").asInstanceOf["step backward"]
    
    inline def `step forward`: "step forward" = ("step forward").asInstanceOf["step forward"]
    
    inline def stethoscope: "stethoscope" = "stethoscope".asInstanceOf["stethoscope"]
    
    inline def `sticker mule`: "sticker mule" = ("sticker mule").asInstanceOf["sticker mule"]
    
    inline def `sticky note`: "sticky note" = ("sticky note").asInstanceOf["sticky note"]
    
    inline def `sticky note outline`: "sticky note outline" = ("sticky note outline").asInstanceOf["sticky note outline"]
    
    inline def stop: "stop" = "stop".asInstanceOf["stop"]
    
    inline def `stop circle`: "stop circle" = ("stop circle").asInstanceOf["stop circle"]
    
    inline def `stop circle outline`: "stop circle outline" = ("stop circle outline").asInstanceOf["stop circle outline"]
    
    inline def stopwatch: "stopwatch" = "stopwatch".asInstanceOf["stopwatch"]
    
    inline def strava: "strava" = "strava".asInstanceOf["strava"]
    
    inline def `street view`: "street view" = ("street view").asInstanceOf["street view"]
    
    inline def strikethrough: "strikethrough" = "strikethrough".asInstanceOf["strikethrough"]
    
    inline def stripe: "stripe" = "stripe".asInstanceOf["stripe"]
    
    inline def `stripe card`: "stripe card" = ("stripe card").asInstanceOf["stripe card"]
    
    inline def `stripe s`: "stripe s" = ("stripe s").asInstanceOf["stripe s"]
    
    inline def student: "student" = "student".asInstanceOf["student"]
    
    inline def studiovinari: "studiovinari" = "studiovinari".asInstanceOf["studiovinari"]
    
    inline def stumbleupon: "stumbleupon" = "stumbleupon".asInstanceOf["stumbleupon"]
    
    inline def `stumbleupon circle`: "stumbleupon circle" = ("stumbleupon circle").asInstanceOf["stumbleupon circle"]
    
    inline def subscript: "subscript" = "subscript".asInstanceOf["subscript"]
    
    inline def subway: "subway" = "subway".asInstanceOf["subway"]
    
    inline def suitcase: "suitcase" = "suitcase".asInstanceOf["suitcase"]
    
    inline def sun: "sun" = "sun".asInstanceOf["sun"]
    
    inline def `sun outline`: "sun outline" = ("sun outline").asInstanceOf["sun outline"]
    
    inline def superpowers: "superpowers" = "superpowers".asInstanceOf["superpowers"]
    
    inline def superscript: "superscript" = "superscript".asInstanceOf["superscript"]
    
    inline def supple: "supple" = "supple".asInstanceOf["supple"]
    
    inline def sync: "sync" = "sync".asInstanceOf["sync"]
    
    inline def `sync alternate`: "sync alternate" = ("sync alternate").asInstanceOf["sync alternate"]
    
    inline def syringe: "syringe" = "syringe".asInstanceOf["syringe"]
    
    inline def table: "table" = "table".asInstanceOf["table"]
    
    inline def `table tennis`: "table tennis" = ("table tennis").asInstanceOf["table tennis"]
    
    inline def tablet: "tablet" = "tablet".asInstanceOf["tablet"]
    
    inline def `tablet alternate`: "tablet alternate" = ("tablet alternate").asInstanceOf["tablet alternate"]
    
    inline def `tachometer alternate`: "tachometer alternate" = ("tachometer alternate").asInstanceOf["tachometer alternate"]
    
    inline def tag: "tag" = "tag".asInstanceOf["tag"]
    
    inline def tags: "tags" = "tags".asInstanceOf["tags"]
    
    inline def talk: "talk" = "talk".asInstanceOf["talk"]
    
    inline def target: "target" = "target".asInstanceOf["target"]
    
    inline def tasks: "tasks" = "tasks".asInstanceOf["tasks"]
    
    inline def taxi: "taxi" = "taxi".asInstanceOf["taxi"]
    
    inline def telegram: "telegram" = "telegram".asInstanceOf["telegram"]
    
    inline def `telegram plane`: "telegram plane" = ("telegram plane").asInstanceOf["telegram plane"]
    
    inline def teletype: "teletype" = "teletype".asInstanceOf["teletype"]
    
    inline def television: "television" = "television".asInstanceOf["television"]
    
    inline def `tencent weibo`: "tencent weibo" = ("tencent weibo").asInstanceOf["tencent weibo"]
    
    inline def terminal: "terminal" = "terminal".asInstanceOf["terminal"]
    
    inline def `text cursor`: "text cursor" = ("text cursor").asInstanceOf["text cursor"]
    
    inline def `text height`: "text height" = ("text height").asInstanceOf["text height"]
    
    inline def `text telephone`: "text telephone" = ("text telephone").asInstanceOf["text telephone"]
    
    inline def `text width`: "text width" = ("text width").asInstanceOf["text width"]
    
    inline def th: "th" = "th".asInstanceOf["th"]
    
    inline def `th large`: "th large" = ("th large").asInstanceOf["th large"]
    
    inline def `th list`: "th list" = ("th list").asInstanceOf["th list"]
    
    inline def theme: "theme" = "theme".asInstanceOf["theme"]
    
    inline def themeisle: "themeisle" = "themeisle".asInstanceOf["themeisle"]
    
    inline def thermometer: "thermometer" = "thermometer".asInstanceOf["thermometer"]
    
    inline def `thermometer empty`: "thermometer empty" = ("thermometer empty").asInstanceOf["thermometer empty"]
    
    inline def `thermometer full`: "thermometer full" = ("thermometer full").asInstanceOf["thermometer full"]
    
    inline def `thermometer half`: "thermometer half" = ("thermometer half").asInstanceOf["thermometer half"]
    
    inline def `thermometer quarter`: "thermometer quarter" = ("thermometer quarter").asInstanceOf["thermometer quarter"]
    
    inline def `thermometer three quarters`: "thermometer three quarters" = ("thermometer three quarters").asInstanceOf["thermometer three quarters"]
    
    inline def `thumb tack`: "thumb tack" = ("thumb tack").asInstanceOf["thumb tack"]
    
    inline def `thumbs down`: "thumbs down" = ("thumbs down").asInstanceOf["thumbs down"]
    
    inline def `thumbs down outline`: "thumbs down outline" = ("thumbs down outline").asInstanceOf["thumbs down outline"]
    
    inline def `thumbs up`: "thumbs up" = ("thumbs up").asInstanceOf["thumbs up"]
    
    inline def `thumbs up outline`: "thumbs up outline" = ("thumbs up outline").asInstanceOf["thumbs up outline"]
    
    inline def thumbtack: "thumbtack" = "thumbtack".asInstanceOf["thumbtack"]
    
    inline def ticket: "ticket" = "ticket".asInstanceOf["ticket"]
    
    inline def `ticket alternate`: "ticket alternate" = ("ticket alternate").asInstanceOf["ticket alternate"]
    
    inline def time: "time" = "time".asInstanceOf["time"]
    
    inline def times: "times" = "times".asInstanceOf["times"]
    
    inline def `times circle`: "times circle" = ("times circle").asInstanceOf["times circle"]
    
    inline def `times circle outline`: "times circle outline" = ("times circle outline").asInstanceOf["times circle outline"]
    
    inline def `times rectangle`: "times rectangle" = ("times rectangle").asInstanceOf["times rectangle"]
    
    inline def tint: "tint" = "tint".asInstanceOf["tint"]
    
    inline def tm: "tm" = "tm".asInstanceOf["tm"]
    
    inline def `toggle down`: "toggle down" = ("toggle down").asInstanceOf["toggle down"]
    
    inline def `toggle left`: "toggle left" = ("toggle left").asInstanceOf["toggle left"]
    
    inline def `toggle off`: "toggle off" = ("toggle off").asInstanceOf["toggle off"]
    
    inline def `toggle on`: "toggle on" = ("toggle on").asInstanceOf["toggle on"]
    
    inline def `toggle right`: "toggle right" = ("toggle right").asInstanceOf["toggle right"]
    
    inline def `toggle up`: "toggle up" = ("toggle up").asInstanceOf["toggle up"]
    
    inline def trademark: "trademark" = "trademark".asInstanceOf["trademark"]
    
    inline def train: "train" = "train".asInstanceOf["train"]
    
    inline def transgender: "transgender" = "transgender".asInstanceOf["transgender"]
    
    inline def `transgender alternate`: "transgender alternate" = ("transgender alternate").asInstanceOf["transgender alternate"]
    
    inline def translate: "translate" = "translate".asInstanceOf["translate"]
    
    inline def trash: "trash" = "trash".asInstanceOf["trash"]
    
    inline def `trash alternate`: "trash alternate" = ("trash alternate").asInstanceOf["trash alternate"]
    
    inline def `trash alternate outline`: "trash alternate outline" = ("trash alternate outline").asInstanceOf["trash alternate outline"]
    
    inline def travel: "travel" = "travel".asInstanceOf["travel"]
    
    inline def treatment: "treatment" = "treatment".asInstanceOf["treatment"]
    
    inline def tree: "tree" = "tree".asInstanceOf["tree"]
    
    inline def trello: "trello" = "trello".asInstanceOf["trello"]
    
    inline def `triangle down`: "triangle down" = ("triangle down").asInstanceOf["triangle down"]
    
    inline def `triangle left`: "triangle left" = ("triangle left").asInstanceOf["triangle left"]
    
    inline def `triangle right`: "triangle right" = ("triangle right").asInstanceOf["triangle right"]
    
    inline def `triangle up`: "triangle up" = ("triangle up").asInstanceOf["triangle up"]
    
    inline def tripadvisor: "tripadvisor" = "tripadvisor".asInstanceOf["tripadvisor"]
    
    inline def trophy: "trophy" = "trophy".asInstanceOf["trophy"]
    
    inline def truck: "truck" = "truck".asInstanceOf["truck"]
    
    inline def `try`: "try" = "try".asInstanceOf["try"]
    
    inline def tty: "tty" = "tty".asInstanceOf["tty"]
    
    inline def tumblr: "tumblr" = "tumblr".asInstanceOf["tumblr"]
    
    inline def `tumblr square`: "tumblr square" = ("tumblr square").asInstanceOf["tumblr square"]
    
    inline def tv: "tv" = "tv".asInstanceOf["tv"]
    
    inline def twitch: "twitch" = "twitch".asInstanceOf["twitch"]
    
    inline def twitter: "twitter" = "twitter".asInstanceOf["twitter"]
    
    inline def `twitter square`: "twitter square" = ("twitter square").asInstanceOf["twitter square"]
    
    inline def typo3: "typo3" = "typo3".asInstanceOf["typo3"]
    
    inline def uber: "uber" = "uber".asInstanceOf["uber"]
    
    inline def uikit: "uikit" = "uikit".asInstanceOf["uikit"]
    
    inline def umbrella: "umbrella" = "umbrella".asInstanceOf["umbrella"]
    
    inline def underline: "underline" = "underline".asInstanceOf["underline"]
    
    inline def undo: "undo" = "undo".asInstanceOf["undo"]
    
    inline def `undo alternate`: "undo alternate" = ("undo alternate").asInstanceOf["undo alternate"]
    
    inline def unhide: "unhide" = "unhide".asInstanceOf["unhide"]
    
    inline def uniregistry: "uniregistry" = "uniregistry".asInstanceOf["uniregistry"]
    
    inline def `universal access`: "universal access" = ("universal access").asInstanceOf["universal access"]
    
    inline def university: "university" = "university".asInstanceOf["university"]
    
    inline def unlink: "unlink" = "unlink".asInstanceOf["unlink"]
    
    inline def unlinkify: "unlinkify" = "unlinkify".asInstanceOf["unlinkify"]
    
    inline def unlock: "unlock" = "unlock".asInstanceOf["unlock"]
    
    inline def `unlock alternate`: "unlock alternate" = ("unlock alternate").asInstanceOf["unlock alternate"]
    
    inline def unmute: "unmute" = "unmute".asInstanceOf["unmute"]
    
    inline def `unordered list`: "unordered list" = ("unordered list").asInstanceOf["unordered list"]
    
    inline def untappd: "untappd" = "untappd".asInstanceOf["untappd"]
    
    inline def upload: "upload" = "upload".asInstanceOf["upload"]
    
    inline def usb: "usb" = "usb".asInstanceOf["usb"]
    
    inline def usd: "usd" = "usd".asInstanceOf["usd"]
    
    inline def user: "user" = "user".asInstanceOf["user"]
    
    inline def `user cancel`: "user cancel" = ("user cancel").asInstanceOf["user cancel"]
    
    inline def `user circle`: "user circle" = ("user circle").asInstanceOf["user circle"]
    
    inline def `user circle outline`: "user circle outline" = ("user circle outline").asInstanceOf["user circle outline"]
    
    inline def `user close`: "user close" = ("user close").asInstanceOf["user close"]
    
    inline def `user delete`: "user delete" = ("user delete").asInstanceOf["user delete"]
    
    inline def `user doctor`: "user doctor" = ("user doctor").asInstanceOf["user doctor"]
    
    inline def `user md`: "user md" = ("user md").asInstanceOf["user md"]
    
    inline def `user outline`: "user outline" = ("user outline").asInstanceOf["user outline"]
    
    inline def `user plus`: "user plus" = ("user plus").asInstanceOf["user plus"]
    
    inline def `user secret`: "user secret" = ("user secret").asInstanceOf["user secret"]
    
    inline def `user times`: "user times" = ("user times").asInstanceOf["user times"]
    
    inline def `user x`: "user x" = ("user x").asInstanceOf["user x"]
    
    inline def users: "users" = "users".asInstanceOf["users"]
    
    inline def ussunnah: "ussunnah" = "ussunnah".asInstanceOf["ussunnah"]
    
    inline def `utensil spoon`: "utensil spoon" = ("utensil spoon").asInstanceOf["utensil spoon"]
    
    inline def utensils: "utensils" = "utensils".asInstanceOf["utensils"]
    
    inline def vaadin: "vaadin" = "vaadin".asInstanceOf["vaadin"]
    
    inline def vcard: "vcard" = "vcard".asInstanceOf["vcard"]
    
    inline def venus: "venus" = "venus".asInstanceOf["venus"]
    
    inline def `venus double`: "venus double" = ("venus double").asInstanceOf["venus double"]
    
    inline def `venus mars`: "venus mars" = ("venus mars").asInstanceOf["venus mars"]
    
    inline def viacoin: "viacoin" = "viacoin".asInstanceOf["viacoin"]
    
    inline def viadeo: "viadeo" = "viadeo".asInstanceOf["viadeo"]
    
    inline def `viadeo square`: "viadeo square" = ("viadeo square").asInstanceOf["viadeo square"]
    
    inline def viber: "viber" = "viber".asInstanceOf["viber"]
    
    inline def video: "video" = "video".asInstanceOf["video"]
    
    inline def `video camera`: "video camera" = ("video camera").asInstanceOf["video camera"]
    
    inline def `video play`: "video play" = ("video play").asInstanceOf["video play"]
    
    inline def vimeo: "vimeo" = "vimeo".asInstanceOf["vimeo"]
    
    inline def `vimeo square`: "vimeo square" = ("vimeo square").asInstanceOf["vimeo square"]
    
    inline def `vimeo v`: "vimeo v" = ("vimeo v").asInstanceOf["vimeo v"]
    
    inline def vine: "vine" = "vine".asInstanceOf["vine"]
    
    inline def vk: "vk" = "vk".asInstanceOf["vk"]
    
    inline def vnv: "vnv" = "vnv".asInstanceOf["vnv"]
    
    inline def `volleyball ball`: "volleyball ball" = ("volleyball ball").asInstanceOf["volleyball ball"]
    
    inline def `volume control phone`: "volume control phone" = ("volume control phone").asInstanceOf["volume control phone"]
    
    inline def `volume down`: "volume down" = ("volume down").asInstanceOf["volume down"]
    
    inline def `volume off`: "volume off" = ("volume off").asInstanceOf["volume off"]
    
    inline def `volume up`: "volume up" = ("volume up").asInstanceOf["volume up"]
    
    inline def vuejs: "vuejs" = "vuejs".asInstanceOf["vuejs"]
    
    inline def warehouse: "warehouse" = "warehouse".asInstanceOf["warehouse"]
    
    inline def warning: "warning" = "warning".asInstanceOf["warning"]
    
    inline def `warning circle`: "warning circle" = ("warning circle").asInstanceOf["warning circle"]
    
    inline def `warning sign`: "warning sign" = ("warning sign").asInstanceOf["warning sign"]
    
    inline def wechat: "wechat" = "wechat".asInstanceOf["wechat"]
    
    inline def weibo: "weibo" = "weibo".asInstanceOf["weibo"]
    
    inline def weight: "weight" = "weight".asInstanceOf["weight"]
    
    inline def weixin: "weixin" = "weixin".asInstanceOf["weixin"]
    
    inline def whatsapp: "whatsapp" = "whatsapp".asInstanceOf["whatsapp"]
    
    inline def `whatsapp square`: "whatsapp square" = ("whatsapp square").asInstanceOf["whatsapp square"]
    
    inline def wheelchair: "wheelchair" = "wheelchair".asInstanceOf["wheelchair"]
    
    inline def whmcs: "whmcs" = "whmcs".asInstanceOf["whmcs"]
    
    inline def `wi-fi`: "wi-fi" = "wi-fi".asInstanceOf["wi-fi"]
    
    inline def wifi: "wifi" = "wifi".asInstanceOf["wifi"]
    
    inline def `wikipedia w`: "wikipedia w" = ("wikipedia w").asInstanceOf["wikipedia w"]
    
    inline def `window close`: "window close" = ("window close").asInstanceOf["window close"]
    
    inline def `window close outline`: "window close outline" = ("window close outline").asInstanceOf["window close outline"]
    
    inline def `window maximize`: "window maximize" = ("window maximize").asInstanceOf["window maximize"]
    
    inline def `window maximize outline`: "window maximize outline" = ("window maximize outline").asInstanceOf["window maximize outline"]
    
    inline def `window minimize`: "window minimize" = ("window minimize").asInstanceOf["window minimize"]
    
    inline def `window minimize outline`: "window minimize outline" = ("window minimize outline").asInstanceOf["window minimize outline"]
    
    inline def `window restore`: "window restore" = ("window restore").asInstanceOf["window restore"]
    
    inline def `window restore outline`: "window restore outline" = ("window restore outline").asInstanceOf["window restore outline"]
    
    inline def windows: "windows" = "windows".asInstanceOf["windows"]
    
    inline def winner: "winner" = "winner".asInstanceOf["winner"]
    
    inline def wizard: "wizard" = "wizard".asInstanceOf["wizard"]
    
    inline def woman: "woman" = "woman".asInstanceOf["woman"]
    
    inline def won: "won" = "won".asInstanceOf["won"]
    
    inline def `won sign`: "won sign" = ("won sign").asInstanceOf["won sign"]
    
    inline def wordpress: "wordpress" = "wordpress".asInstanceOf["wordpress"]
    
    inline def `wordpress beginner`: "wordpress beginner" = ("wordpress beginner").asInstanceOf["wordpress beginner"]
    
    inline def `wordpress forms`: "wordpress forms" = ("wordpress forms").asInstanceOf["wordpress forms"]
    
    inline def `wordpress simple`: "wordpress simple" = ("wordpress simple").asInstanceOf["wordpress simple"]
    
    inline def world: "world" = "world".asInstanceOf["world"]
    
    inline def wpbeginner: "wpbeginner" = "wpbeginner".asInstanceOf["wpbeginner"]
    
    inline def wpexplorer: "wpexplorer" = "wpexplorer".asInstanceOf["wpexplorer"]
    
    inline def wpforms: "wpforms" = "wpforms".asInstanceOf["wpforms"]
    
    inline def wrench: "wrench" = "wrench".asInstanceOf["wrench"]
    
    inline def write: "write" = "write".asInstanceOf["write"]
    
    inline def `write square`: "write square" = ("write square").asInstanceOf["write square"]
    
    inline def x: "x" = "x".asInstanceOf["x"]
    
    inline def xbox: "xbox" = "xbox".asInstanceOf["xbox"]
    
    inline def xing: "xing" = "xing".asInstanceOf["xing"]
    
    inline def `xing square`: "xing square" = ("xing square").asInstanceOf["xing square"]
    
    inline def `y combinator`: "y combinator" = ("y combinator").asInstanceOf["y combinator"]
    
    inline def yahoo: "yahoo" = "yahoo".asInstanceOf["yahoo"]
    
    inline def yandex: "yandex" = "yandex".asInstanceOf["yandex"]
    
    inline def `yandex international`: "yandex international" = ("yandex international").asInstanceOf["yandex international"]
    
    inline def yelp: "yelp" = "yelp".asInstanceOf["yelp"]
    
    inline def yen: "yen" = "yen".asInstanceOf["yen"]
    
    inline def `yen sign`: "yen sign" = ("yen sign").asInstanceOf["yen sign"]
    
    inline def yoast: "yoast" = "yoast".asInstanceOf["yoast"]
    
    inline def youtube: "youtube" = "youtube".asInstanceOf["youtube"]
    
    inline def `youtube play`: "youtube play" = ("youtube play").asInstanceOf["youtube play"]
    
    inline def `youtube square`: "youtube square" = ("youtube square").asInstanceOf["youtube square"]
    
    inline def zip: "zip" = "zip".asInstanceOf["zip"]
    
    inline def zoom: "zoom" = "zoom".asInstanceOf["zoom"]
    
    inline def `zoom in`: "zoom in" = ("zoom in").asInstanceOf["zoom in"]
    
    inline def `zoom out`: "zoom out" = ("zoom out").asInstanceOf["zoom out"]
    
    inline def `zoom-in`: "zoom-in" = "zoom-in".asInstanceOf["zoom-in"]
    
    inline def `zoom-out`: "zoom-out" = "zoom-out".asInstanceOf["zoom-out"]
  }
  type SemanticICONS = /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 1250, starting with "american sign language interpreting", "assistive listening systems", "audio description" */ String
  
  object SemanticSIZES {
    
    inline def big: "big" = "big".asInstanceOf["big"]
    
    inline def huge: "huge" = "huge".asInstanceOf["huge"]
    
    inline def large: "large" = "large".asInstanceOf["large"]
    
    inline def massive: "massive" = "massive".asInstanceOf["massive"]
    
    inline def medium: "medium" = "medium".asInstanceOf["medium"]
    
    inline def mini: "mini" = "mini".asInstanceOf["mini"]
    
    inline def small: "small" = "small".asInstanceOf["small"]
    
    inline def tiny: "tiny" = "tiny".asInstanceOf["tiny"]
  }
  type SemanticSIZES = "mini" | "tiny" | "small" | "medium" | "large" | "big" | "huge" | "massive"
  
  object SemanticSTATICTRANSITIONS {
    
    inline def bounce: "bounce" = "bounce".asInstanceOf["bounce"]
    
    inline def flash: "flash" = "flash".asInstanceOf["flash"]
    
    inline def glow: "glow" = "glow".asInstanceOf["glow"]
    
    inline def jiggle: "jiggle" = "jiggle".asInstanceOf["jiggle"]
    
    inline def pulse: "pulse" = "pulse".asInstanceOf["pulse"]
    
    inline def shake: "shake" = "shake".asInstanceOf["shake"]
    
    inline def tada: "tada" = "tada".asInstanceOf["tada"]
  }
  type SemanticSTATICTRANSITIONS = "jiggle" | "flash" | "shake" | "pulse" | "tada" | "bounce" | "glow"
  
  type SemanticShorthandCollection[TProps] = js.Array[SemanticShorthandItem[TProps]]
  
  type SemanticShorthandContent = ReactNode
  
  type SemanticShorthandItem[TProps /* <: Record[String, Any] */] = ReactNode | SemanticShorthandItemFunc[TProps] | ((Omit[TProps, "children"]) & Children[TProps])
  
  type SemanticShorthandItemFunc[TProps] = js.Function3[
    /* component */ ElementType[TProps], 
    /* props */ TProps, 
    /* children */ js.UndefOr[ReactNode | ReactNodeArray], 
    ReactElement | Null
  ]
  
  object SemanticTEXTALIGNMENTS {
    
    inline def center: "center" = "center".asInstanceOf["center"]
    
    inline def justified: "justified" = "justified".asInstanceOf["justified"]
    
    inline def left: "left" = "left".asInstanceOf["left"]
    
    inline def right: "right" = "right".asInstanceOf["right"]
  }
  type SemanticTEXTALIGNMENTS = "left" | "center" | "right" | "justified"
  
  object SemanticTRANSITIONS {
    
    inline def bounce: "bounce" = "bounce".asInstanceOf["bounce"]
    
    inline def browse: "browse" = "browse".asInstanceOf["browse"]
    
    inline def `browse right`: "browse right" = ("browse right").asInstanceOf["browse right"]
    
    inline def drop: "drop" = "drop".asInstanceOf["drop"]
    
    inline def fade: "fade" = "fade".asInstanceOf["fade"]
    
    inline def `fade down`: "fade down" = ("fade down").asInstanceOf["fade down"]
    
    inline def `fade left`: "fade left" = ("fade left").asInstanceOf["fade left"]
    
    inline def `fade right`: "fade right" = ("fade right").asInstanceOf["fade right"]
    
    inline def `fade up`: "fade up" = ("fade up").asInstanceOf["fade up"]
    
    inline def flash: "flash" = "flash".asInstanceOf["flash"]
    
    inline def `fly down`: "fly down" = ("fly down").asInstanceOf["fly down"]
    
    inline def `fly left`: "fly left" = ("fly left").asInstanceOf["fly left"]
    
    inline def `fly right`: "fly right" = ("fly right").asInstanceOf["fly right"]
    
    inline def `fly up`: "fly up" = ("fly up").asInstanceOf["fly up"]
    
    inline def glow: "glow" = "glow".asInstanceOf["glow"]
    
    inline def `horizontal flip`: "horizontal flip" = ("horizontal flip").asInstanceOf["horizontal flip"]
    
    inline def jiggle: "jiggle" = "jiggle".asInstanceOf["jiggle"]
    
    inline def pulse: "pulse" = "pulse".asInstanceOf["pulse"]
    
    inline def scale: "scale" = "scale".asInstanceOf["scale"]
    
    inline def shake: "shake" = "shake".asInstanceOf["shake"]
    
    inline def `slide down`: "slide down" = ("slide down").asInstanceOf["slide down"]
    
    inline def `slide left`: "slide left" = ("slide left").asInstanceOf["slide left"]
    
    inline def `slide right`: "slide right" = ("slide right").asInstanceOf["slide right"]
    
    inline def `slide up`: "slide up" = ("slide up").asInstanceOf["slide up"]
    
    inline def `swing down`: "swing down" = ("swing down").asInstanceOf["swing down"]
    
    inline def `swing left`: "swing left" = ("swing left").asInstanceOf["swing left"]
    
    inline def `swing right`: "swing right" = ("swing right").asInstanceOf["swing right"]
    
    inline def `swing up`: "swing up" = ("swing up").asInstanceOf["swing up"]
    
    inline def tada: "tada" = "tada".asInstanceOf["tada"]
    
    inline def `vertical flip`: "vertical flip" = ("vertical flip").asInstanceOf["vertical flip"]
    
    inline def zoom: "zoom" = "zoom".asInstanceOf["zoom"]
  }
  type SemanticTRANSITIONS = "browse" | ("browse right") | "drop" | "fade" | ("fade up") | ("fade down") | ("fade left") | ("fade right") | ("fly up") | ("fly down") | ("fly left") | ("fly right") | ("horizontal flip") | ("vertical flip") | "scale" | ("slide up") | ("slide down") | ("slide left") | ("slide right") | ("swing up") | ("swing down") | ("swing left") | ("swing right") | "zoom" | "jiggle" | "flash" | "shake" | "pulse" | "tada" | "bounce" | "glow"
  
  object SemanticVERTICALALIGNMENTS {
    
    inline def bottom: "bottom" = "bottom".asInstanceOf["bottom"]
    
    inline def middle: "middle" = "middle".asInstanceOf["middle"]
    
    inline def top: "top" = "top".asInstanceOf["top"]
  }
  type SemanticVERTICALALIGNMENTS = "top" | "middle" | "bottom"
  
  object SemanticWIDTHS {
    
    inline def `1`: 1 = 1.asInstanceOf[1]
    
    inline def `10`: 10 = 10.asInstanceOf[10]
    
    inline def `11`: 11 = 11.asInstanceOf[11]
    
    inline def `12`: 12 = 12.asInstanceOf[12]
    
    inline def `13`: 13 = 13.asInstanceOf[13]
    
    inline def `14`: 14 = 14.asInstanceOf[14]
    
    inline def `15`: 15 = 15.asInstanceOf[15]
    
    inline def `16`: 16 = 16.asInstanceOf[16]
    
    inline def `2`: 2 = 2.asInstanceOf[2]
    
    inline def `3`: 3 = 3.asInstanceOf[3]
    
    inline def `4`: 4 = 4.asInstanceOf[4]
    
    inline def `5`: 5 = 5.asInstanceOf[5]
    
    inline def `6`: 6 = 6.asInstanceOf[6]
    
    inline def `7`: 7 = 7.asInstanceOf[7]
    
    inline def `8`: 8 = 8.asInstanceOf[8]
    
    inline def `9`: 9 = 9.asInstanceOf[9]
    
    inline def eight: "eight" = "eight".asInstanceOf["eight"]
    
    inline def eleven: "eleven" = "eleven".asInstanceOf["eleven"]
    
    inline def fifteen: "fifteen" = "fifteen".asInstanceOf["fifteen"]
    
    inline def five: "five" = "five".asInstanceOf["five"]
    
    inline def four: "four" = "four".asInstanceOf["four"]
    
    inline def fourteen: "fourteen" = "fourteen".asInstanceOf["fourteen"]
    
    inline def nine: "nine" = "nine".asInstanceOf["nine"]
    
    inline def one: "one" = "one".asInstanceOf["one"]
    
    inline def seven: "seven" = "seven".asInstanceOf["seven"]
    
    inline def six: "six" = "six".asInstanceOf["six"]
    
    inline def sixteen: "sixteen" = "sixteen".asInstanceOf["sixteen"]
    
    inline def ten: "ten" = "ten".asInstanceOf["ten"]
    
    inline def thirteen: "thirteen" = "thirteen".asInstanceOf["thirteen"]
    
    inline def three: "three" = "three".asInstanceOf["three"]
    
    inline def twelve: "twelve" = "twelve".asInstanceOf["twelve"]
    
    inline def two: "two" = "two".asInstanceOf["two"]
  }
  type SemanticWIDTHS = 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 15 | 16 | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9" | "10" | "11" | "12" | "13" | "14" | "15" | "16" | "one" | "two" | "three" | "four" | "five" | "six" | "seven" | "eight" | "nine" | "ten" | "eleven" | "twelve" | "thirteen" | "fourteen" | "fifteen" | "sixteen"
  
  object SemanticWIDTHSNUMBER {
    
    inline def `1`: 1 = 1.asInstanceOf[1]
    
    inline def `10`: 10 = 10.asInstanceOf[10]
    
    inline def `11`: 11 = 11.asInstanceOf[11]
    
    inline def `12`: 12 = 12.asInstanceOf[12]
    
    inline def `13`: 13 = 13.asInstanceOf[13]
    
    inline def `14`: 14 = 14.asInstanceOf[14]
    
    inline def `15`: 15 = 15.asInstanceOf[15]
    
    inline def `16`: 16 = 16.asInstanceOf[16]
    
    inline def `2`: 2 = 2.asInstanceOf[2]
    
    inline def `3`: 3 = 3.asInstanceOf[3]
    
    inline def `4`: 4 = 4.asInstanceOf[4]
    
    inline def `5`: 5 = 5.asInstanceOf[5]
    
    inline def `6`: 6 = 6.asInstanceOf[6]
    
    inline def `7`: 7 = 7.asInstanceOf[7]
    
    inline def `8`: 8 = 8.asInstanceOf[8]
    
    inline def `9`: 9 = 9.asInstanceOf[9]
  }
  // ======================================================
  // Widths
  // ======================================================
  type SemanticWIDTHSNUMBER = 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 15 | 16
  
  object SemanticWIDTHSSTRING {
    
    inline def `1`: "1" = "1".asInstanceOf["1"]
    
    inline def `10`: "10" = "10".asInstanceOf["10"]
    
    inline def `11`: "11" = "11".asInstanceOf["11"]
    
    inline def `12`: "12" = "12".asInstanceOf["12"]
    
    inline def `13`: "13" = "13".asInstanceOf["13"]
    
    inline def `14`: "14" = "14".asInstanceOf["14"]
    
    inline def `15`: "15" = "15".asInstanceOf["15"]
    
    inline def `16`: "16" = "16".asInstanceOf["16"]
    
    inline def `2`: "2" = "2".asInstanceOf["2"]
    
    inline def `3`: "3" = "3".asInstanceOf["3"]
    
    inline def `4`: "4" = "4".asInstanceOf["4"]
    
    inline def `5`: "5" = "5".asInstanceOf["5"]
    
    inline def `6`: "6" = "6".asInstanceOf["6"]
    
    inline def `7`: "7" = "7".asInstanceOf["7"]
    
    inline def `8`: "8" = "8".asInstanceOf["8"]
    
    inline def `9`: "9" = "9".asInstanceOf["9"]
    
    inline def eight: "eight" = "eight".asInstanceOf["eight"]
    
    inline def eleven: "eleven" = "eleven".asInstanceOf["eleven"]
    
    inline def fifteen: "fifteen" = "fifteen".asInstanceOf["fifteen"]
    
    inline def five: "five" = "five".asInstanceOf["five"]
    
    inline def four: "four" = "four".asInstanceOf["four"]
    
    inline def fourteen: "fourteen" = "fourteen".asInstanceOf["fourteen"]
    
    inline def nine: "nine" = "nine".asInstanceOf["nine"]
    
    inline def one: "one" = "one".asInstanceOf["one"]
    
    inline def seven: "seven" = "seven".asInstanceOf["seven"]
    
    inline def six: "six" = "six".asInstanceOf["six"]
    
    inline def sixteen: "sixteen" = "sixteen".asInstanceOf["sixteen"]
    
    inline def ten: "ten" = "ten".asInstanceOf["ten"]
    
    inline def thirteen: "thirteen" = "thirteen".asInstanceOf["thirteen"]
    
    inline def three: "three" = "three".asInstanceOf["three"]
    
    inline def twelve: "twelve" = "twelve".asInstanceOf["twelve"]
    
    inline def two: "two" = "two".asInstanceOf["two"]
  }
  type SemanticWIDTHSSTRING = "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9" | "10" | "11" | "12" | "13" | "14" | "15" | "16" | "one" | "two" | "three" | "four" | "five" | "six" | "seven" | "eight" | "nine" | "ten" | "eleven" | "twelve" | "thirteen" | "fourteen" | "fifteen" | "sixteen"
  
  type ShorthandRenderFunction[C /* <: ElementType[Any] */, P] = js.Function2[/* Component */ C, /* props */ P, ReactNode]
  
  trait StrictHtmlIframeProps extends StObject {
    
    var src: js.UndefOr[String] = js.undefined
  }
  object StrictHtmlIframeProps {
    
    inline def apply(): StrictHtmlIframeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictHtmlIframeProps]
    }
    
    extension [Self <: StrictHtmlIframeProps](x: Self) {
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
  
  trait StrictHtmlImageProps extends StObject {
    
    var src: js.UndefOr[String] = js.undefined
  }
  object StrictHtmlImageProps {
    
    inline def apply(): StrictHtmlImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictHtmlImageProps]
    }
    
    extension [Self <: StrictHtmlImageProps](x: Self) {
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
  
  trait StrictHtmlInputrops extends StObject {
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object StrictHtmlInputrops {
    
    inline def apply(): StrictHtmlInputrops = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictHtmlInputrops]
    }
    
    extension [Self <: StrictHtmlInputrops](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait StrictHtmlLabelProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object StrictHtmlLabelProps {
    
    inline def apply(): StrictHtmlLabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictHtmlLabelProps]
    }
    
    extension [Self <: StrictHtmlLabelProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait StrictHtmlSpanProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object StrictHtmlSpanProps {
    
    inline def apply(): StrictHtmlSpanProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictHtmlSpanProps]
    }
    
    extension [Self <: StrictHtmlSpanProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
