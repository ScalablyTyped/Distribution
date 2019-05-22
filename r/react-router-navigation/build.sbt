organization := "org.scalablytyped"
name := "react-router-navigation"
version := "1.0-dt-20190212Z-836a7d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-225f24",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-0e3323",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-ff94fb",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190520Z-43357b",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190519Z-32ec59",
  "org.scalablytyped" %%% "react-navigation" % "3.0-dt-20190507Z-a8eeb9",
  "org.scalablytyped" %%% "react-router" % "5.0-dt-20190520Z-d2fe5c",
  "org.scalablytyped" %%% "react-router-navigation-core" % "1.0-dt-20181017Z-048de9",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        