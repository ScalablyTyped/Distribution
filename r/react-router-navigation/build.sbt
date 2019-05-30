organization := "org.scalablytyped"
name := "react-router-navigation"
version := "1.0-dt-20190212Z-9745fe"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-8a2cd0",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-684028",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c843c9",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-1fde1d",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190524Z-df3a62",
  "org.scalablytyped" %%% "react-navigation" % "3.0-dt-20190507Z-d35d7a",
  "org.scalablytyped" %%% "react-router" % "5.0-dt-20190520Z-a09a5c",
  "org.scalablytyped" %%% "react-router-navigation-core" % "1.0-dt-20181017Z-d493e4",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        