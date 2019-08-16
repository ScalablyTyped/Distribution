organization := "org.scalablytyped"
name := "react-router-navigation"
version := "1.0-dt-20190212Z-a14068"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-796a7a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-46401f",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190814Z-806854",
  "org.scalablytyped" %%% "react-navigation" % "3.0-dt-20190805Z-a16795",
  "org.scalablytyped" %%% "react-router" % "5.0-dt-20190702Z-dc7032",
  "org.scalablytyped" %%% "react-router-navigation-core" % "1.0-dt-20181017Z-be1135",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        