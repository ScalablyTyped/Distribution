organization := "org.scalablytyped"
name := "react-router-navigation"
version := "1.0-dt-20190212Z-0313df"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-796a7a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190807Z-04c1be",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190802Z-2d1529",
  "org.scalablytyped" %%% "react-navigation" % "3.0-dt-20190805Z-e46993",
  "org.scalablytyped" %%% "react-router" % "5.0-dt-20190702Z-0536fe",
  "org.scalablytyped" %%% "react-router-navigation-core" % "1.0-dt-20181017Z-06e939",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        